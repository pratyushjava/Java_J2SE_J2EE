package performService;

public class SingingMagician extends Magician {

	private Song song;
	
	public SingingMagician(String trick) {
		super(trick);
		
	}


	public void setSong(Song song) {
		this.song = song;
	}


	@Override
	public void perform() {
		super.perform();
		
		song.sing();
	}
	
	
	
}
