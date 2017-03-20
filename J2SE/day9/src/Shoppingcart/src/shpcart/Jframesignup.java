package shpcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jframesignup extends JFrame {

	JPanel ps1,ps2;
	JLabel l1,l2,l3,dl1,dl2,dl3,dl4,dl5,dl6;
	JButton sb1,sb2;
	JTextField t1,t2,t3;
	public Jframesignup(String title)
	{
		super(title);
		setSize(300,300);
		setLocationRelativeTo(null);
		 getContentPane().setBackground(Color.CYAN);
		 l1=new JLabel("Name");
		 l2=new JLabel("Email");
		 l3=new JLabel("Pasword");
		 dl1=new JLabel();
		 dl2=new JLabel();
		 dl3=new JLabel();
		 dl4=new JLabel();
		 dl5=new JLabel();
		 dl6=new JLabel();
		 ps1=new JPanel(new GridLayout(6, 2, 25, 20));
		 t1=new JTextField(30);
		 t2=new JTextField(30);
		 t3=new JTextField(30);
		 ps1.add(l1);
		 ps1.add(t1);
		
		 ps1.add(l2);
		 ps1.add(t2);
		
		 ps1.add(l3);
		 ps1.add(t3);
		 ps1.add(dl1);
		 ps1.add(dl2);
		 ps1.add(dl3);
		 ps1.add(dl4);
		 ps1.add(dl5);
		 ps1.add(dl6);
		 sb1=new JButton("Submit");
		 sb2=new JButton("Reset");
		 ps2=new JPanel(new GridLayout(1,2,25,20));
		 ps2.add(sb1);
		 ps2.add(sb2);
		 add(ps2,BorderLayout.SOUTH);
		 add(ps1);
		 setVisible(true);
		
		
	}
	

}
