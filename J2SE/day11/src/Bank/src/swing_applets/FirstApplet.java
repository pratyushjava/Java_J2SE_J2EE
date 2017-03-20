package swing_applets;

import java.awt.BorderLayout;
/*
<applet code="swing_applets.FirstApplet" width="400" height="400">
</applet>
*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FirstApplet extends JApplet {
	private StringBuilder sb;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		getContentPane().setBackground(Color.CYAN);
		add(new JLabel("Hello Applets....."),BorderLayout.NORTH);
		sb=new StringBuilder("In init ");
		MyPanel p1=new MyPanel();
		add(p1);
	}

	@Override
	public void start() {
		
		sb.append(" in start ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		sb.append("In stop ");
	}

	@Override
	public void destroy() {
		sb.append("in Destroy ");
		System.out.println(" in destroy");
		
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		sb.append("in paint ");
	}
	class MyPanel extends JPanel
	
	{
		public MyPanel() {
			setBackground(Color.PINK);
		}
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			sb.append("in paintC");
			g.setColor(Color.RED);
			Graphics2D g2=(Graphics2D) g;
			Ellipse2D.Double e1=new Ellipse2D.Double(100,50, 100,100);
			g2.fill(e1);
			g2.drawString(sb.toString(), 10,300);
			g2.drawString(getCodeBase().toString(), 10,310);
			g2.drawString(getDocumentBase().toString(), 10,320);
			
		}
	}
	
	
}
