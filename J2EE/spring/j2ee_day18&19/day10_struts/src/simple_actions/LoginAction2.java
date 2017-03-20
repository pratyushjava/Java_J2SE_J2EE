package simple_actions;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import pojos.UserPOJO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction2 extends ActionSupport implements ServletContextAware,ModelDriven<UserPOJO>{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<Integer,UserPOJO> users;
	private ServletContext ctx;
	private UserPOJO user=new UserPOJO();
	
	public LoginAction2() {
		//init & populate HM
		System.out.println("in login action2 constr");
		
	}
	
	

	@Override
	public UserPOJO getModel() {
		// TODO Auto-generated method stub
		return user;
	}



	@Override
	public void setServletContext(ServletContext arg0) {
		ctx=arg0;
		
	}


	
	

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		//if its for 1st time --- create empty HM &
		//populate it --- o.w retrieve the same from appln scope
	
		users=(HashMap<Integer, UserPOJO>) ctx.getAttribute("user_list1");
		if (users == null)
		{
			System.out.println("1st time inits....");
			users=new HashMap<Integer, UserPOJO>();
			UserPOJO[] u1={new UserPOJO(1,"aa", 100),new UserPOJO(2,"bb", 200)};
			for (UserPOJO u : u1)
				users.put(u.getId(),u);
			ctx.setAttribute("user_list1",users);
		}
		System.out.println("id = "+user.getId());
		if (users.containsKey(user.getId())) {
			user=users.get(user.getId());
			return SUCCESS;
			
		}
		return ERROR;
		
	}



	public UserPOJO getUser() {
		return user;
	}



	public void setUser(UserPOJO user) {
		this.user = user;
	}
	
	

}
