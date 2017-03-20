package swing_applets;

//JSplitPane with One Horizontal and One Vertical Split Pane (TJSplitPane.java)
/*
 * <Applet code=TJSplitPane width=400 height=300>
 * </Applet>
 */
 
import javax.swing.*;

public class TJSplitPane extends JApplet {
    static int HORIZSPLIT = JSplitPane.HORIZONTAL_SPLIT;
    static int VERTSPLIT = JSplitPane.VERTICAL_SPLIT;
  
    Icon icon1 = new ImageIcon("g:/images/ani_marv.gif");
    Icon icon2 = new ImageIcon("g:/images/ani_road.gif");
    Icon icon3 = new ImageIcon("g:/images/ani_taz.gif");

    public void init() {
        // 1. Create a label to display icon1 and add it to a scroll pane.    
        JLabel label1 = new JLabel(icon1);
        JScrollPane topLeftComp = new JScrollPane(label1);
        
        // 2. Create another lable to display icon2 and add it to another scroll pane.
        JLabel label2 = new JLabel(icon2);
        JScrollPane bottomLeftComp = new JScrollPane(label2);
        
        // 3. Create a third label to display icon3 and add it to one more scroll pane.
        JLabel label3 = new JLabel(icon3);
        JScrollPane rightComp = new JScrollPane(label3);
    
        // 4. Add the scroll panes displaying icon1 and icon2 to a split pane.
        JSplitPane splitPane1 = new JSplitPane(VERTSPLIT,
                                                                                  topLeftComp,
                                          bottomLeftComp);
  
        splitPane1.setDividerSize(2); // Divider size.
        splitPane1.setDividerLocation(0.5); // Initial location of the divider.
        
        // 5. Add the previous split pane and the scroll pane displaying 
        // icon3 to an outer split pane.
        JSplitPane splitPane2 = new JSplitPane(HORIZSPLIT,                                        
                                          splitPane1, // left comp
                                          rightComp);
  
        splitPane2.setDividerLocation(0.5);
        splitPane2.setDividerSize(4); 
           
        // 6. Add the outer split pane to the content pane of the applet.                             
        add(splitPane2);                                 
    }
}
