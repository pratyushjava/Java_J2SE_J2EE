package jsflogin; 
 
import javax.faces.application.FacesMessage; 
import javax.faces.context.FacesContext; 
 
public class LoginBean 
{ 
    String username; 
    String password; 

    public LoginBean() 
    { 
        //Empty Constructor 
    } 
 
    public String getUsername() 
    { 
        return this.username; 
    } 
 
    public void setUsername(String data) 
    { 
        this.username = data; 
    } 
 
    public String getPassword() 
    { 
        return password; 
    } 
 
    public void setPassword(String data) 
    { 
        this.password = data; 
    } 
 
    public String login() 
    { 
        if ( username.equals("aaaa") && password.equals("bbbb")) 
        { 
            return "success"; 
        } 
        else 
        { 
            FacesContext context = FacesContext.getCurrentInstance(); 
            FacesMessage message = new FacesMessage("Invalid Username and/or Password"); 
            context.addMessage("loginForm", message);
            return "failure"; 
        } 
    } 
} 