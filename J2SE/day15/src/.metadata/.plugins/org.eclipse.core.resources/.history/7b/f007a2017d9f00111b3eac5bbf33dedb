package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangerFrame extends JFrame implements ActionListener,
		Runnable {
	private JButton strt, stop;
	private JPanel p1, p2;
	private Color c;
	private Random r1;
	private boolean exit;
	private Thread t;

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == strt) {
				if (t == null) {
					exit = false;
					t = new Thread(this);
					t.start();
				}
			} else
				exit = true;
		} catch (Exception e1) {
			System.out.println("err in aP " + e1);
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
		strt = new JButton("Start");
		strt.addActionListener(this);
		p2.add(strt);
		stop = new JButton("Stop");
		stop.addActionListener(this);
		p2.add(stop);
		add(p2, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r1 = new Random();
		c = Color.CYAN;

		setVisible(true);
	}

	private void changeColor() {
		c = new Color(r1.nextInt(255), r1.nextInt(255), r1.nextInt(255));
	}

	@Override
	public void run() {
		// keep changing color till stop btn is pressed
		System.out.println("strted exec " + Thread.currentThread().getName());
		try {
			while (!exit) {
				changeColor();
				p1.setBackground(c);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("exc in thrd "
					+ Thread.currentThread().getName() + " " + e.getMessage());
		}
		t = null;
		System.out.println("stopped exec " + Thread.currentThread().getName());

	}

}
