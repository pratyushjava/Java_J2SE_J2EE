package tester1;

import static java.lang.System.out;   
  
public class TestVarArgs2 {   
  
    public static void m(Object o) {   
        out.println("object");   
    }   
       
    public static void m(String o) {   
        out.println("string");   
    }   
       
  /* public static void m(Integer o) {   
        out.println("integer");   
    }*/  
	 public static void m(int... o) {   
        out.println("integer Var-args");   
    }  
  /*public static void m(long i) {   
        out.println("long");   
    } */
	

    /**  
     *widening beats autoboxing, autoboxing beats varargs --- i.e javac while deciding among 
     *overloaded vrsions, first will try to widen & chk if there exists a matching form , ow it will try auto-boxing
     * ow it tries var-args at the end
     */  
    public static void main(String[] args) {   
     m(null); 
		//m(1);
  
    }   
}  
