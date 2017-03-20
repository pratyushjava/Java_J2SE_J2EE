package tester;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

import emp.EmpUtils;

import java.rmi.*;

public class EmpUtilsRMIClnt extends JFrame implements ActionListener {
	private JTextField t1;
	private JTextArea t2;
	private JButton insert;
	private EmpUtils remRef;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			EmpUtilsRMIClnt t1 = new EmpUtilsRMIClnt("RMI - JDBC clnt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public EmpUtilsRMIClnt(String title) throws Exception {
		super(title);
		initGUIComps();
		initRMI();
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
		add(insert, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	private void initRMI() throws Exception {
		remRef = (EmpUtils) Naming.lookup("rmi://localhost:1099/Emp_utils");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == t1)
				t2.setText(remRef.getEmpDtls(Integer.parseInt(t1.getText())));
			else
				addEmpRecord();
		} catch (Exception e1) {
			t2.setText(e1.getMessage());
		}
	}

	private void addEmpRecord() throws Exception {

		Scanner sc = new Scanner(JOptionPane.showInputDialog(this,
				"Enter Id,name,addr,sal,deptId"));
		remRef.insertEmpRecord(sc.nextInt(), sc.next(), sc.next(),
				sc.nextDouble(), sc.nextInt(), sc.next());

	}

}
