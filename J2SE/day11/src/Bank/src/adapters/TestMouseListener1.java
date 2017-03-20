
package adapters;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class TestMouseListener1 extends JFrame  {
	public TestMouseListener1(String msg) {
		super(msg);
		setSize(200,200);
		setLocationRelativeTo(null);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me)
			{
				System.out.println("mouse pressed");
			}
		}
		);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestMouseListener1("Handling ME");

	}

}
