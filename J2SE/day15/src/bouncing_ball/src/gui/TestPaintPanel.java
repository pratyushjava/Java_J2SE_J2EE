package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPaintPanel extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPaintPanel("hello");

	}
	public TestPaintPanel(String msg) {
		super(msg);
		System.out.println("main invoked by "+Thread.currentThread().getName());
		setSize(400,400);
		getContentPane().setBackground(Color.YELLOW);
		add(new JLabel("testing paint"),BorderLayout.NORTH);
		add(new JLabel("testing "),BorderLayout.SOUTH);
		JPanel p1=new MyPanel();
		add(p1);
		System.out.println(p1.getBounds().height);//0
		setVisible(true);
		System.out.println(p1.getBounds().height);//330
		
	}
	private class MyPanel extends JPanel
	{
		public MyPanel() {
			setBackground(Color.CYAN);
		}
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			System.out.println("paint invoked by "+Thread.currentThread().getName());
			Rectangle r1=getBounds();
			
			Graphics2D g2=(Graphics2D) g;
			g2.setColor(Color.GREEN);
			Ellipse2D.Double e1=new Ellipse2D.Double(r1.getCenterX(),r1.getCenterY(), 50,50);
			g2.fill(e1);
			
		}

	}
	
}
