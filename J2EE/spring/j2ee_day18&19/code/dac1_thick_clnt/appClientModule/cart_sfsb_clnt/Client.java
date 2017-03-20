package cart_sfsb_clnt;

import java.util.*;

import javax.naming.*;
import cart.ShoppingCart;

public class Client {
	private static ShoppingCart cart;
	private static Scanner sc;
	private static InitialContext ctx;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		boolean exit = false;
	//	Random r1=new Random();

		while (!exit) {
			try {
				// display choice menu to the user.
				System.out.println("Enter Your Choice");
				System.out.println("1 --- Login");
				System.out.println("2 --- Add Product to Cart");
				System.out.println("3 --- View Cart");
				System.out.println("4 --- Logout");
				System.out.println("5 --- Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					login();
					break;
				case 2:
					addToCart();
					break;
				case 3:
				
					viewCart();
				
					
					break;
				case 4:
					logout();
					break;
				case 5:
					close();
					exit = true;
					break;

				}
			} catch (Exception e) {
				System.out
						.println("Sorry , U have logged out, Pls login again -"+e.getMessage());
			}
		}

	}

	private static void login() throws Exception {
		ctx = new InitialContext();
		
		cart = (ShoppingCart) ctx.lookup("shopping_cart");
	}

	private static void addToCart() {
		System.out.println("Enter Product Name & Quantity");
		String prod = sc.next();
		int quantity = sc.nextInt();
		System.out.printf("Adding To Cart -- %d %s", quantity, prod);
		cart.buy(prod, quantity);
	}

	private static void viewCart() {
		System.out.println("Print cart:");
		HashMap<String, Integer> fullCart = cart.getCartContents();
		Set<Map.Entry<String, Integer>> entries = fullCart.entrySet();
		for (Map.Entry<String, Integer> e : entries) {
			System.out.printf("Product %s Quantity %d %n", e.getKey(),
					e.getValue());
		}

	}

	private static void logout() {
		System.out.println("Checking out Cart & logging out...");
		// checkout() is annotated with @Remove
		// when clnt calls any method of @Remove anno.
		// for SFSB, EJBC will discard SFSB inst.
		// If clnt tries to invoke any B.L methods using the same
		// stub ref --- EJBC throws SFSB instance not found exc.
		// Better prog style --- nullify cart ref.

		cart.checkout();
		cart=null;
		

	}
	private static void close() throws Exception
	{
		if (cart != null)
			cart.checkout();
		if (ctx != null)
			ctx.close();
	}
}
