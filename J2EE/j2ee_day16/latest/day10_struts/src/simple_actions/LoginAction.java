package simple_actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//props of Action class 
	private String uName,uPass;
	

	public LoginAction() {
		System.out.println("in login action constr");
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


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	

}
