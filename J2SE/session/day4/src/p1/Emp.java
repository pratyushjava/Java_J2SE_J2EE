package p1;

public class Emp {
	private int id;
	private String name;

	public Emp(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	// method level annotation --- meant for javac
	// u r specifying to the compiler --- whatever follows is the overriding
	// form of the method
	public String toString() {
		return "Emp " + id + "  " + name;
	}

	
}
