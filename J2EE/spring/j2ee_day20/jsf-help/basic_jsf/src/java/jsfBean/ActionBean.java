package jsfBean;
import javax.faces.component.html.*;
import javax.faces.event.*;

public class ActionBean {


public void changeIt (ActionEvent e)
	{
	 HtmlCommandButton b=(HtmlCommandButton)e.getComponent();
	 if (b.getValue().equals("Login"))
	  b.setValue("Register");
	 else
	  b.setValue("Login");

	}
}