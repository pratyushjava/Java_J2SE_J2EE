package simple_actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	// D.M ---props
	// prop names MUST match with rq param names
	// Only then params interceptor -- will invoke matching setters
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
	//B.L
	@Override
	public String execute() throws Exception {
		if(uName.equals("abc") && uPass.equals("123"))
			return SUCCESS;
		return ERROR;
	}
	

}
