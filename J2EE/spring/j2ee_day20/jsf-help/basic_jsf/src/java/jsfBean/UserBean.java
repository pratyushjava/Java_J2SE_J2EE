package jsfBean;
import java.util.List;
import java.util.Map;
import java.util.Date;

//POJO class to show IOC working & indexed properties.
public class UserBean
  {    
	private String firstName;
      private String lastName;   
      private String phone;  
      private String email;
      private List tasks;
      private Map recentBlogEntries;
	  private Date dateOfBirth;

    public UserBean()
      {
		setDateOfBirth(new Date());
       System.out.println("in UserBean()");
      }

    public void setFirstName(String firstName)
      {
        this.firstName = firstName;
      }

    public String getFirstName()
      {
        return firstName;
      }

    public void setLastName(String lastName)
      {
        this.lastName = lastName;
      }

    public String getLastName()
      {
        return lastName;
      }

    public void setPhone(String phone)
      {
        this.phone = phone;
      }

    public String getPhone()
      {
        return phone;
      }

    public void setEmail(String email)
      {
        this.email = email;
      }

    public String getEmail()
      {
        return email;
      }
      public void setTasks(List l)
      {
       tasks=l;
      }
      public List getTasks()
      {
       return tasks;
      }
      public void setRecentBlogEntries(Map l)
      {
       recentBlogEntries=l;
      }
      public Map getRecentBlogEntries()
      {
       return recentBlogEntries;
      }
	  public void setDateOfBirth(Date dateOfBirth)
  {
    this.dateOfBirth = dateOfBirth;
  }
  public Date getDateOfBirth()
  {
    return dateOfBirth;
  }
}

