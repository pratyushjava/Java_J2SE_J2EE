package jdbc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Scanner;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestPSTUpdate extends JFrame implements ActionListener {
	private Connection cn;
	private PreparedStatement pst, pst1;
	private JTextField t1;
	private JTextArea t2;
	private JButton insert;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			TestPSTUpdate t1 = new TestPSTUpdate("GUI+JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TestPSTUpdate(String title) throws Exception {
		super(title);
		initGUIComps();
		initDB();
	}

	private void initGUIComps() {
		setSize(300, 200);
		JLabel l1 = new JLabel("Enter Emp ID");
		t1 = new JTextField(40);
		t1.addActionListener(this);
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		p1.add(l1);
		p1.add(t1);
		add(p1, BorderLayout.NORTH);
		t2 = new JTextArea(10, 40);
		JScrollPane jsp = new JScrollPane(t2);
		add(jsp);
		insert = new JButton("Insert Emp Record");
		insert.addActionListener(this);
		JPanel p2=new JPanel();
		p2.add(insert);
		add(p2, BorderLayout.SOUTH);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					// close pst db cn before terminating
					if (pst != null)
						pst.close();
					if (cn != null)
						cn.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}

		});
		setVisible(true);
	}

	private void initDB() throws Exception {
		// load cls
		Class.forName("oracle.jdbc.OracleDriver");
		// get cn
		String dbURL = "jdbc:oracle:thin:@192.168.72.3:1521:orcl";
		cn = DriverManager.getConnection(dbURL, "oraw60", "oraw60");
		String sql = "select * from my_emp where empid=?";
		// pst --- pre-parsed , pre-compiled stmt obj
		pst = cn.prepareStatement(sql);
		// insert query
		sql = "insert into my_emp values(?,?,?,?,?,?)";
		pst1 = cn.prepareStatement(sql);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == t1)
			dispEmpInfo();
		else
			addEmpRecord();
	}

	private void dispEmpInfo() {
		ResultSet rst = null;
		try {
			// set IN param/s
			int id = Integer.parseInt(t1.getText());
			pst.setInt(1, id);
			// exec query, get rst -- forward only
			rst = pst.executeQuery();
			if (rst.next())
				t2.setText("Emp ID " + rst.getInt(1) + " Name "
						+ rst.getString(2) + "  Sal " + rst.getDouble(4));
			else
				t2.setText("Emp " + id + "  doesn't exist, pls retry!!!!");
		} catch (Exception e1) {
			System.out.println("in eventLis --- err " + e1);
		} finally {
			if (rst != null)
				try {
					rst.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}

	}

	private void addEmpRecord() {
		try {
			// pst1 ---insert query

			// set In params
			Scanner sc = new Scanner(JOptionPane.showInputDialog(this,
					"Enter Id,name,addr,sal,deptId"));
			pst1.setInt(1, sc.nextInt());// int id
			pst1.setString(2, sc.next());// string nm
			pst1.setString(3, sc.next());// string adr
			pst1.setDouble(4, sc.nextDouble());// double sal
			pst1.setString(5, sc.next());// string deptId
			String date = JOptionPane.showInputDialog(this,
					"Enter join date of emp yyyy-mm-dd");
			pst1.setDate(6, Date.valueOf(date));
			// executeUpdate --- indicate sts
			JOptionPane.showMessageDialog(this,
					"Inserted row count ---" + pst1.executeUpdate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
