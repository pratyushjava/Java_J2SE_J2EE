import java.lang.reflect.*;
import java.awt.*;

class Reflection1 {

   public static void main(String[] args) {
    try {
      Class c=Class.forName(args[0]);
      printDetails(c);
      printSuperclasses(c);
      printInterfaceNames(c);
      printFieldNames(c);
      showConstructors(c);
      showMethods(c);
    
   } catch(Exception e)
   {
     System.out.println("Err "+e);
   }
   }

   static void printDetails(Class c) {
       String s = c.getName();
       System.out.println("class Name "+s +" is "+(c.isInterface()?" interface":" class "));
      //display modifiers
      System.out.print("Modifiers  ");
      int m = c.getModifiers();
      if (Modifier.isPublic(m))
         System.out.print("public  ");
      if (Modifier.isAbstract(m))
         System.out.print("abstract  ");
      if (Modifier.isFinal(m))
         System.out.print("final");
      System.out.println();
   }
     static void printSuperclasses(Class subclass) {
     
      Class superclass; 
      System.out.println("Inheritance Hierarchy ");
      while ((superclass=subclass.getSuperclass()) != null) {
         
         System.out.println(superclass.getName());
         subclass = superclass;
       }
     }

     static void printInterfaceNames(Class c) {
      System.out.println("Interfaces Implemented  ");
      Class[] theInterfaces = c.getInterfaces();
      for (int i = 0; i < theInterfaces.length; i++) 
        System.out.println(theInterfaces[i].getName());
     
   }
   static void printFieldNames(Class c) {
      System.out.println("Field Details ");
      Field[] publicFields = c.getFields();
      for (int i = 0; i < publicFields.length; i++) 
         System.out.println("Field Name: " + publicFields[i].getName() +" Type: " + publicFields[i].getType());
         
      }
     
    static void showConstructors(Class c) {
      
      Constructor[] theConstructors = c.getConstructors();
      for (int i = 0; i < theConstructors.length; i++) {
         System.out.print("( ");
         Class[] parameterTypes =theConstructors[i].getParameterTypes();
         for (int k = 0; k < parameterTypes.length; k ++) 
            System.out.print(parameterTypes[k].getName()+ " ");
         
         System.out.println(")");
         }
   }
    static void showMethods(Class c) {
      
      Method[] theMethods = c.getMethods();
      for (int i = 0; i < theMethods.length; i++) {
         System.out.println("Name: " +theMethods[i].getName() +"Return Type " +theMethods[i].getReturnType().getName());
        
         Class[] parameterTypes = theMethods[i].getParameterTypes();
         System.out.print("   Parameter Types:");
         for (int k = 0; k < parameterTypes.length; k ++) 
            System.out.print(" " +parameterTypes[k].getName());
         System.out.println();
     } 
   
    }
}

