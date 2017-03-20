package jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.sql.*;

public class TestPST extends JFrame implements ActionListener {
	private JTextField t1;
	private JTextArea t2;
	private Connection cn;
	private PreparedStatement pst;

	@Override
	public void actionPerformed(ActionEvent e) {
		ResultSet rst = null;
		t2.setText("");
		try {
			// set IN param
			pst.setString(1, t1.getText());
			t1.setText("");

			rst = pst.executeQuery();
			int rows=0;
			while (rst.next()) {
				t2.append("Emp ID " + rst.getInt(1) + " Name "
						+ rst.getString("name") + " Sal " + rst.getDouble(4)
						+ "\n");
				rows++;
			}
			if (rows ==0)
				t2.setText("Dept ID Invalid.....");
		} catch (Exception e1) {
			t2.append("err in aP " + e1);
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new TestPST("Testing PST");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public TestPST(final String msg) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				setUPGUI(msg);

			}
		});

		setUPDB();
	}

	private void setUPGUI(String title) {
		System.out.println("in setup " + Thread.currentThread().getName());
		setTitle(title);
		setSize(400, 200);
		setLocationRelativeTo(null);
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Enter Dept ID"));
		t1 = new JTextField(40);
		t1.addActionListener(this);
		p1.add(t1);
		add(p1, BorderLayout.NORTH);
		t2 = new JTextArea(10, 40);
		add(new JScrollPane(t2));
		// wl
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					// TODO Auto-generated method stub
					if (pst != null)
						pst.close();
					if (cn != null)
						cn.close();
				} catch (Exception e1) {
					System.out.println("err in closing " + e1);
				}
				System.exit(0);
			}

		});
		setVisible(true);
	}

	private void setUPDB() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// get cn from DM
		String dbURL = "jdbc:mysql://localhost:3306/testjdbc";
		cn = DriverManager.getConnection(dbURL, "root", "root");
		// pst
		String sql = "select * from my_emp where deptid=?";
		pst = cn.prepareStatement(sql);// def rst

	}

}
