package spel.model;

public class Customer {
	
	private Item item;
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
		return "Customer [item=" + item + ", name=" + name + "]";
	}
	
	

}
