package jsfBean;

import java.util.Date;

public class PaymentBean {
   private double amount;
   private String card = "";
   private Date date = new Date();

   // PROPERTY: amount
   public void setAmount(double newValue) { amount = newValue; }
   public double getAmount() { return amount; }

   // PROPERTY: card
   public void setCard(String newValue) { card = newValue; }
   public String getCard() { return card; }

   // PROPERTY: date
   public void setDate(Date newValue) { date = newValue; 
   if (newValue.after(new Date()))
   {
	   System.out.println("valid");
   }
   else
   	   System.out.println("expired");
   }
   public Date getDate() { return date; }
}
