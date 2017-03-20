package validate;

import java.util.Date;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;

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
   
   public void validateDate(FacesContext context, 
					UIComponent component, 
					Object input) throws ValidatorException {
		  //gets entered date.
		  Date var = (Date)input;
		  String s=String.format("%1$tm/%1$tY",var);
		  
		  System.out.println("new date "+s);
		 
		  if(var.before(new Date())){
			throw new ValidatorException(
						new FacesMessage("Card Expired", "Card Expired : Expiry date "+s));
		  }
	} 

}
