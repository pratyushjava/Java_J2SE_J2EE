package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPaintPanelApplet extends JApplet{
	private JPanel p1;

	/**
	 * @param args
	 */
	@Override
		public void init() {
	
		System.out.println("init invoked by "+Thread.currentThread().getName());
		setSize(400,400);
		getContentPane().setBackground(Color.YELLOW);
		add(new JLabel("testing paint"),BorderLayout.NORTH);
		add(new JLabel("testing "),BorderLayout.SOUTH);
		p1=new MyPanel();
		add(p1);
		System.out.println("init "+p1.getBounds().height);//0
		
		
		
	}
	@Override
	public void start()
	{
		System.out.println("start "+p1.getBounds().height);//330
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
