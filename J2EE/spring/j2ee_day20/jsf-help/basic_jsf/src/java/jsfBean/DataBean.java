package jsfBean;
   
   public class DataBean {
      private String inString;
      private long numLong;
      private double numReal;
   
      public DataBean() {
         inString = "Default";
         numLong = 1000;
         numReal = 0.5;
      }
   
      public String getInString() { return inString; }
      public void setInString(String string) { 
         inString = string; }
      public long getNumLong() { return numLong;}
      public void setNumLong(long n_long) {
          numLong = n_long; }
      public double getNumReal() { 
          return numReal; }
      public void setNumReal(double n_real) { 
          numReal = n_real;  }
   }
