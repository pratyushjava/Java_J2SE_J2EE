package adapters;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class TestMouseListener extends JFrame implements MouseListener {
	public TestMouseListener(String msg) {
		super(msg);
		setSize(200,200);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("rlsed");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestMouseListener("Handling ME");

	}

}
