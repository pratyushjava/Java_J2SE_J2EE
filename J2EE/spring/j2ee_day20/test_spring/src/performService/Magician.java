package performService;

public class Magician implements Performer {
	
	private String trick;//trick which he performs 
	
	
	
	
	public Magician(String trick) {
		this.trick=trick;
		
	}



	@Override
	public void perform() {
		System.out.printf("Performs Trick of %s ",trick);

	}

}
