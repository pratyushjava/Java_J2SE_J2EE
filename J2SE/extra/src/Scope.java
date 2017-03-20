class Scope {
  public static void main(String args[]) {
    int x; // known to all code within main

    x = 1;
	byte b=3;
	 System.out.println("x is " + b);
    if(x == 1) {
      int y = 20; 

     
      System.out.println("x and y: " + x + " " + y);
      x = y * 2;
    }
     int y = 100; 

    
    System.out.println("x is " + x);
  }
}
