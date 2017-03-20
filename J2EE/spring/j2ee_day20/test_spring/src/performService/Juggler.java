package performService;

public class Juggler implements Performer {
	
	private String itemName;//what juggler juggles
	private int count;//no of items  juggled at a time
	
	
	
	public Juggler(String itemName, int count) {
		this.itemName = itemName;
		this.count = count;
	}



	@Override
	public void perform() {
		System.out.printf("Performs juggling of %d %s concurrently",count,itemName);

	}

}
