package swing_frms;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestPaint extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPaint();

	}
	public TestPaint() {
		setSize(200,200);
		setLocationRelativeTo(null);
		JLabel l1=new JLabel("Testing.....");
		l1.setForeground(Color.MAGENTA);
		add(l1);
		getContentPane().setBackground(Color.CYAN);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.YELLOW);
		g.draw3DRect(10,10, 150,150,true);
		g.drawString("hello jshdjs",10, 100);
	}
}
