package swing_frms;

// Using class MouseMotionAdapter.
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int pointCount = 0; // count number of points

	// array of 10000 java.awt.Point references
	private Point[] points = new Point[10000];
	private Color c;
	private Random r;

	// set up GUI and register mouse event handler
	public PaintPanel() {
		r = new Random();

		// handle frame mouse motion event
		addMouseMotionListener(

		new MouseMotionAdapter() // anonymous inner class
		{
			// store drag coordinates and repaint
			public void mouseDragged(MouseEvent event) {
				if (pointCount < points.length) {
					points[pointCount] = event.getPoint(); // find point
					pointCount++; // increment number of points in array
					repaint(); // repaint JFrame
				} // end if
			} // end method mouseDragged
		} // end anonymous inner class
		); // end call to addMouseMotionListener
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				randomColor();
				pointCount = 0;// to start filling point array from beginning
			}

		});
	} // end PaintPanel constructor

	// draw ovals in a 10X10 bounding box at specified locations on window
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area
		g.setColor(c);
		// draw all points in array
		for (int i = 0; i < pointCount; i++)
			g.fillOval(points[i].x, points[i].y, 10, 10);
	} // end method paintComponent

	// generates a random color
	private void randomColor() {
		c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}
} // end class PaintPanel

