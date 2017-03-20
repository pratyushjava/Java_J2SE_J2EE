package spel.model.newname;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("item3")
public class Item {
	@Value("#{dataBean1.getName()}")
	private String name;
	@Value("#{dataBean1.getQuantity()}")
	private int quantity;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + "]";
	}
	
	

}
