package Tester;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test extends JFrame{

	/**
	 * @param args
	 */
	JButton b1,b2;
	JPanel p1,p2;
	JLabel l1;
	private Thread t;
	boolean flag;
	public static void main(String[] args) {
		

		setDefaultLookAndFeelDecorated(true);
		new test();
	}
	
	public test() {
	initGui("color game");
	}
	
	
	public void initGui(String s)
	{
		setLocationRelativeTo(null);
		setSize(200, 200);
		l1=new JLabel("hello welcome to play game");
		l1.setSize(500,300);
		b1=new JButton("start");
		b2=new JButton("stop");
		p1=new JPanel(new GridLayout(1, 2, 5, 5));
		p2=new JPanel();
		p1.add(b1);
		p1.add(b2);
		p2.add(l1);
		add(p1,BorderLayout.SOUTH);
		add(p2);
		
		p2.setBackground(Color.red);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				flag=false;
				new  mythread();
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			flag=true;	
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class mythread implements Runnable
	{
		
		
		public mythread() {
			System.out.println("in my thread constr");
			
			t=new Thread(this);
			
			t.start();
		}
		@Override
		public void run() {
			System.out.println("in thread run");
			Random r1=new Random();
			
			while(!flag)
			{
				System.out.println("no of times while called");
				p2.setBackground(new Color(r1.nextFloat(), r1.nextFloat(), r1.nextFloat()));
					try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	

}
