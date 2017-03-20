package swing_frms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.*;

class TabbedPaneExample extends JFrame {

	private JTabbedPane tabbedPane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private HashMap<String, Double> books;

	public TabbedPaneExample() {

		setTitle("Tabbed Pane Application");
		setSize(300, 200);
		setBackground(Color.gray);

		JPanel topPanel = new JPanel(new BorderLayout());

		books = new HashMap<String, Double>();
		books.put("Head First", 100.0);
		books.put("XML", 400.50);
		books.put("SCJP", 600.00);
		// Create the tab pages
		createPage1();
		createPage2();
		createPage3();

		// Create a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Page 1", panel1);
		tabbedPane.addTab("Page 2", panel2);
		tabbedPane.addTab("Page 3", panel3);
		topPanel.add(tabbedPane, BorderLayout.CENTER);
		add(topPanel);
	}

	public void createPage1() {
		panel1 = new JPanel(new GridLayout(3, 2, 10, 30));

		JLabel label1 = new JLabel("Username:");
		panel1.add(label1);

		JTextField field = new JTextField();
		panel1.add(field);

		JLabel label2 = new JLabel("Password:");
		panel1.add(label2);

		JPasswordField fieldPass = new JPasswordField();
		panel1.add(fieldPass);
	}

	public void createPage2() {
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(books.size()+1, 2));
		Set<Map.Entry<String, Double>> entries = books.entrySet();
		
		for (Map.Entry<String, Double> e : entries) {
			panel2.add(new JCheckBox(e.getKey()));
			panel2.add(new JLabel(e.getValue().toString()));
		}
		JButton b1=new JButton("Add To Cart");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				StringBuilder sb=new StringBuilder("Books Added to cart \n");
				Component[] comps=panel2.getComponents();
				for (Component c: comps)
				{
					if (c instanceof JCheckBox)
						if (((JCheckBox) c).isSelected())
							sb.append(((JCheckBox) c).getText()+"  ");
				}
				System.out.println(sb);
				System.out.println();
				
			}
		});
		panel2.add(b1);
	}

	public void createPage3() {
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3, 2));

		panel3.add(new JLabel("Field 1:"));
		panel3.add(new TextArea());
		panel3.add(new JLabel("Field 2:"));
		panel3.add(new TextArea());
		panel3.add(new JLabel("Field 3:"));
		panel3.add(new TextArea());
	}

	// Main method to get things started
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				// Create an instance of the test application
				TabbedPaneExample mainFrame = new TabbedPaneExample();
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
	}
}
