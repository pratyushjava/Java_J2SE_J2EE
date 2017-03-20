package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class SimpleImage1 extends JApplet {
	Image img;

	public void init() {

		try {

			
			 img=ImageIO.read(new File("g:/images/purpleflowers.png"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class MyPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			System.out.println("1");
			g.drawImage(img, 10, 10, this);
		}
	}

}
