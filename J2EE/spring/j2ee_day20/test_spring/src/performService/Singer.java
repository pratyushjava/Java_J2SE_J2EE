package performService;

public class Singer implements Song {

	private String language;
	private String title;
	
	public void setLanguage(String language) {
		this.language = language;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void sing() {
		System.out.printf(" While Singing %s song --- %s%n",language,title);
	}

}
