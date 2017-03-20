package Thread_frame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bouncingball extends JFrame {

	
	public static void main(String[] args) {
	new Bouncingball("bouncing ball");
	}
	Bouncingball(String s)
	{
		super(s);
		setSize(300,300);
		setLocationRelativeTo(null);
		
		
		}
public class MyPannel extends JPanel
{
	MyPannel()
	{
		setBackground(Color.CYAN);
	}
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
	}
}
}
