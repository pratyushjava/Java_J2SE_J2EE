package cart_sfsb;
import java.util.HashMap;
import javax.ejb.Remove;
import javax.ejb.Remote;


@Remote
public interface ShoppingCart
{
   void buy(String product, int quantity);

   HashMap<String, Integer> getCartContents();

    void checkout();
}
