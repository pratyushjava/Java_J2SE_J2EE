package swing_frms;
// Testing MouseTrackerFrame.
import javax.swing.JFrame;

public class MouseTracker 
{
   public static void main( String[] args )
   { 
      MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame(); 
      mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseTrackerFrame.setSize( 300, 100 ); // set frame size
      mouseTrackerFrame.setLocationRelativeTo(null);
      mouseTrackerFrame.setVisible( true ); // display frame
   } // end main
} // end class MouseTracker

