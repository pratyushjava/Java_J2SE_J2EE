package performService;

public class SingingJuggler extends Juggler {
	private Song song;
	
	
	public SingingJuggler(String itemName, int count) {
		super(itemName, count);
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
