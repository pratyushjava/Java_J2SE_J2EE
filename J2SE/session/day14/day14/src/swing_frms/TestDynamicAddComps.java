package swing_frms;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestDynamicAddComps extends JApplet {

	private MyPanel p1;
	private JTextField t1;
	@Override
	public void init()
	{
		p1=new MyPanel();
		add(p1);
		t1=new JTextField("10");
		t1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				p1.draw();
			
				
			}
		});
		add(t1,BorderLayout.SOUTH);
	}
	
	private class MyPanel extends JPanel
	{
		
		
		private void draw()
		{
			removeAll();
		//	updateUI();
			int count=Integer.parseInt(t1.getText());
			int root=(int) Math.sqrt(count);
			setLayout(new GridLayout(root, root));
			System.out.println(count+"  "+root);
			for (int i=0;i<count;i++)
			{
				add(new JCheckBox());
			}
			revalidate();
		}
	}

}
