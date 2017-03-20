package why_spring.beans;
public class Student2 {
    private int id;
    private String firstName;
    private String lastName;
    private UpdateInfoPrinter printer;

    //no-args 
    public Student2() {
    	printer=UpdateInfoPrinterFactory.getUpdateInfoPrinter();
    }

    public Student2(String firstName, String lastName) {
    	this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) {
    	
        printer.print("setId", this.id, id);
        this.id = id;
    }

    public void setFirstName(String firstName) {
        printer.print("setFirstName", this.firstName, firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        printer.print("setLastName", this.lastName, lastName);
        this.lastName = lastName;
    }

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

// add hashCode() and equals() methods to store students in Set
}