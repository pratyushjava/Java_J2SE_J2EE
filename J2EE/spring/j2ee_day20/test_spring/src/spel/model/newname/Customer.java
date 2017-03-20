package spel.model.newname;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
	
	@Value("#{item3}")
	private Item item;
	@Value("#{item3.name}")
	private String name;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer Purchased [item=" + item + ", Item name=" + name + "]";
	}
	
	

}
