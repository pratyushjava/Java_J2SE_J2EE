import java.lang.reflect.*;
import java.awt.*;

class Reflection2 {

   public static void main(String[] args) {
    try {
      //dynamic method invocation
     System.out.println(myMethod(args[0],args[1],args[2],args[3],args[4]));
   } catch(Exception e)
   {
     e.printStackTrace();
   }
   }

public static Object myMethod(String clsName,String methName,String paramType,String firstWord, String secondWord) throws Exception {
		  Object result = null;
   // the class whose method has to be invoked.
      Class c = Class.forName(clsName);
		 
      // class type of the parameter for specified method : 
	  Class pType=Class.forName(paramType);
      Class[] parameterTypes = new Class[] {pType};
      Method cMethod;
      Object[] arguments = new Object[] {secondWord};
      
       // getMethod() : 1st arg : String -> method name.
       // 2nd arg : Class[] of the method param types.
        cMethod = c.getMethod(methName, parameterTypes);
       // invoke method : 1st arg : an object whose method will be invoked.
       // 2nd arg : array of argument vals to be passed
        result = cMethod.invoke(firstWord, arguments);
      return result;
   }

 }

