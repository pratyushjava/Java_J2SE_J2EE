package jsfBean; 
import java.util.Iterator; 
import javax.faces.component.*; 
import javax.faces.context.FacesContext; 
import javax.faces.event.ActionEvent; 
import javax.faces.event.ActionListener; 
//import javax.faces.event.PhaseId; 
//import javax.faces.tree.Tree; 


public class MyActionListener implements ActionListener { 


 
 public void processAction(ActionEvent event) {   
   System.out.println("processAction called");  
   // the component that triggered the action event 
   UIComponent component = event.getComponent();
   System.out.println(   
    "The id of the component that fired the action event: "   
    + component.getId());   
  

      FacesContext facesContext = FacesContext.getCurrentInstance();
      UIViewRoot root= facesContext.getViewRoot();
	  System.out.println("root "+root.getId());
	  
  
      System.out.println("----------- Component Tree ------------");
      navigateComponentTree(root, 0); 
      System.out.println("----------------------------------------"); 
  } 


   private void navigateComponentTree( 
      UIComponent component, int level){ 
      // indent 
      for (int i=0; i<level; i++) 
        System.out.print(" "); 
      // print component id 
      System.out.println(component.getId()); 
      Iterator children = component.getChildren().iterator(); 
      // navigate children 
      while (children.hasNext()) { 
         UIComponent child = (UIComponent) children.next();
         navigateComponentTree(child, level + 1); 
       } 
     } 
} 
