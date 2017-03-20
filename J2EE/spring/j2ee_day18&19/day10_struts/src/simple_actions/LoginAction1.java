package simple_actions;

import java.util.HashMap;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport implements ServletContextAware{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uName,uPass;
	private HashMap<String,String> users;
	private ServletContext ctx;
	
	public LoginAction1() {
		//init & populate HM
		System.out.println("in login action1 constr");
		
	}
	

	@Override
	public void setServletContext(ServletContext arg0) {
		ctx=arg0;
		
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public String getuPass() {
		return uPass;
	}


	public void setuPass(String uPass) {
		this.uPass = uPass;
	}


	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		//if its for 1st time --- create empty HM &
		//populate it --- o.w retrieve the same from appln scope
	
		users=(HashMap<String, String>) ctx.getAttribute("user_list");
		if (users == null)
		{
			System.out.println("1st time inits....");
			users=new HashMap<String, String>();
			users.put("aa","bb");
			users.put("aa1","bb1");
			users.put("aa2","bb2");
			ctx.setAttribute("user_list",users);
		}
		if (users.containsKey(uName))
			if (users.get(uName).equals(uPass))
				return SUCCESS;
		return ERROR;
	}
	

}
