package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangerFrame extends JFrame implements ActionListener,
		Runnable {
	private JButton start, stop;
	private JPanel p1, p2;
	private Random r1;
	private Color c;
	private boolean exit;
	private Thread t;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == start) {
				if (t == null) {
					exit = false;
					t = new Thread(this);// new
					t.start();
				}
			} else
				exit = true;
		} catch (Exception e1) {
			System.out.println("exc in aP " + e1);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ColorChangerFrame("GUI_Thrds");

	}

	public ColorChangerFrame(String title) {
		super(title);
		setSize(400, 200);
		setLocationRelativeTo(null);
		p1 = new JPanel();
		p1.setBackground(Color.CYAN);
		add(p1);
		p2 = new JPanel(new GridLayout(1, 2, 20, 10));
		start = new JButton("Start");
		start.addActionListener(this);
		p2.add(start);
		stop = new JButton("Stop");
		stop.addActionListener(this);
		p2.add(stop);
		add(p2, BorderLayout.SOUTH);
		r1 = new Random();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

	private void changeColor() {
		System.out.println("change C " + Thread.currentThread().getName());
		c = new Color(r1.nextInt(255), r1.nextInt(255), r1.nextInt(255));
	}

	@Override
	public void run() {
		System.out.println("thrd started " + Thread.currentThread().getName());
		try {
			while (!exit) {
				changeColor();
				p1.setBackground(c);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("exc in thrd "
					+ Thread.currentThread().getName() + " " + e);
		}
		t = null;
		System.out.println("thrd over " + Thread.currentThread().getName());

	}

}
