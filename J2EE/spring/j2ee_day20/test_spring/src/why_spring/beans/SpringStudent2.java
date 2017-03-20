package why_spring.beans;

public class SpringStudent2 {
	private int id;
	private String firstName;
	private String lastName;
	private UpdateInfoPrinter printer;

	// no-args
	public SpringStudent2() {
		// no need to inject dependency --i.e DOES NOT NEED Helper factory class
		System.out.println("in spring student 2 constr");
	}

	public SpringStudent2(int id, String firstName, String lastName) {
		System.out.println("in constr 1");

		// no need to call def constr.
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public SpringStudent2(String firstName, int id, String lastName) {
		System.out.println("in constr 2");
		// no need to call def constr.
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setPrinter(UpdateInfoPrinter printer) {
		this.printer = printer;
	}

	public void setFirstName(String firstName) {
		printer.print("setFirstName", this.firstName, firstName);
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Stu dtls  [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	

	// add if required --hashCode() and equals() methods to store students in
	// Set
}