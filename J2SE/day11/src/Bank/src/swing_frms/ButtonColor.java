package swing_frms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColor extends JFrame {
	/**
	 * 
	 */
//	private static final long serialVersionUID = -8774955756655616289L;
	private JButton red, green, blue;
	private JPanel p2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ButtonColor("Testing JButton+Events");
	}

	public ButtonColor(String msg) {
		super(msg);
		System.out.println("constr invoked by "
				+ Thread.currentThread().getName());
		setSize(400, 200);
		setLocationRelativeTo(null);
		// create JPanel to hold btns
		JPanel p1 = new JPanel(new GridLayout(1, 3, 20, 10));
		// populate JPanel
		red = new JButton("Red");
		//creating inst of listener cls
		MyListener m1=new MyListener();
		//registering event src with listener
		red.addActionListener(m1);
		p1.add(red);
		green = new JButton("Green");
		green.addActionListener(m1);
		p1.add(green);
		blue = new JButton("Blue");
		blue.addActionListener(m1);
		p1.add(blue);
		// add Jpanel to south region
		add(p1, BorderLayout.SOUTH);
		// create color panel
		p2 = new JPanel();// def layout=Flow
		// add it to center
		add(p2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ae) {
			// get label of clicked btn
			System.out.println("aP by "+Thread.currentThread().getName());
			Color c =Color.WHITE;
			String s = ae.getActionCommand().toUpperCase();
			switch (s) {
			case "RED":
				c = Color.RED;
				break;
			case "GREEN":
				c = Color.GREEN;
				break;
			case "BLUE":
				c = Color.BLUE;
				break;
			}
			p2.setBackground(c);
		}

	}
}