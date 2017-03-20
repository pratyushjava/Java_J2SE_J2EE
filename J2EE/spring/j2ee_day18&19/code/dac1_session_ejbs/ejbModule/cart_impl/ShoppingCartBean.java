 package cart_impl;

import java.util.HashMap;
import javax.ejb.*;

import cart.ShoppingCart;

@Stateful(mappedName="shopping_cart")

public class ShoppingCartBean implements ShoppingCart
{
   private HashMap<String, Integer> cart = new HashMap<String, Integer>();

   @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
   public void buy(String product, int quantity)
   {
      if (cart.containsKey(product))
      {
         int currq = cart.get(product);
         currq += quantity;
         cart.put(product, currq);
      }
      else
      {
         cart.put(product, quantity);
      }
   }

   public HashMap<String, Integer> getCartContents()
   {
      return cart;
   }

   @Remove
   public void checkout()
   {
      System.out.println("Checking out the client for stateFul bean!");
   }
}
