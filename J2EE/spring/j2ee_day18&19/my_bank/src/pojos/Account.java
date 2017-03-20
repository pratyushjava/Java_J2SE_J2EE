
package pojos;

/**
 *
 * @author Administrator
 */
public class Account {
    private int id;
    private String type;
    private double balance;

    public Account(int id, String type, double balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    public Account(int id) {
        this.id = id;
    }

    

   


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", id=" + id + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
    


}
