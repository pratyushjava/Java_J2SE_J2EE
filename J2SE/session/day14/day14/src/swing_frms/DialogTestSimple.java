package swing_frms;

import java.awt.*;
import java.awt.event.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.*;

public class DialogTestSimple {
	public static void main(String[] args) {
		DialogFrame frame = new DialogFrame();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.initColl();
	}
}

@SuppressWarnings("serial")
class DialogFrame extends JFrame {
	private JTextArea t1;
	private HashMap<String, String> users;

	private RegisterDialog dialog;

	//String prefix;// try ano inner class with prefix-suffix

	public DialogFrame() {
		setTitle("DialogTest");
		setSize(300, 200);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);

	
		JMenuItem registerItem = new JMenuItem("Register");
		registerItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (dialog == null) // first time
					dialog = new RegisterDialog();
				dialog.setVisible(true); // pop up dialog
			}
		});
		fileMenu.add(registerItem);

		JMenuItem dispItem = new JMenuItem("Display");
		dispItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				
				Collection<String> v=users.values();
				for (String s : v)
					t1.append(s +"\n");
				System.out.println("Users  " + t1.getText());

			}
		});
		fileMenu.add(dispItem);
		// The Exit item exits the program

		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		fileMenu.add(exitItem);

		t1 = new JTextArea(40, 20);
		JScrollPane jsp = new JScrollPane(t1);
		add(jsp);
	}

	// initializes empty HM
	void initColl() {
		users = new HashMap<String, String>();
	}

	// inner class : can directly access outer class's HM -users
	class RegisterDialog extends JDialog {
		private JTextField t1;
		private JPasswordField t2;
		private JLabel l1, l2;

		public RegisterDialog() {
			//JDialog(Component parent,String title,boolean modal)
			super(DialogFrame.this, "Regsiter DialogTest", true);
			l1 = new JLabel("Email");
			l2 = new JLabel("Password");
			t1 = new JTextField(40);
			t2 = new JPasswordField(40);
			JButton b1 = new JButton("Register");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					users.put(t1.getText(), new String(t2.getPassword()));
					t1.setText("");
					t2.setText("");
					setVisible(false);
				}
			});

			JPanel p1 = new JPanel(new GridLayout(2, 2));
			p1.add(l1);
			p1.add(t1);
			p1.add(l2);
			p1.add(t2);

			p1.add(b1);
			add(p1);
			add(b1, BorderLayout.SOUTH);

			setSize(250, 150);
			setLocationRelativeTo(null);
		}
	}
}