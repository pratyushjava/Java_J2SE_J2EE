package why_spring.beans;
public class SpringStudent {
    private int id;
    private String firstName;
    private String lastName;
    private UpdateInfoPrinter printer;

    //no-args 
    public SpringStudent() {
    	//no need to inject dependency --i.e DOES NOT NEED Helper factory class
    	System.out.println("in spring student constr");
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

	public void setPrinter(UpdateInfoPrinter printer) {
		this.printer = printer;
	}
	

// add hashCode() and equals() methods to store students in Set
}