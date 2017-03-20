package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class  SimpleImage extends JApplet 
{
	Image img;
	
	public void init()
	{
		
		img=getImage(getCodeBase(),"ani_marv.gif");
		
			
	}
	
 public void paint(Graphics g)
	{
	 super.paint(g);
	 System.out.println("1");
	 g.drawImage(img,10,10,this);
	}
	
}
