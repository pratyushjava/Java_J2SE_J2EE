package simple_actions;



import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport {

	private String uName, uPass;

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
		System.out.println("in action");
		if (uName.equals("aa") && uPass.equals("bb"))
			return SUCCESS;
		return ERROR;
	}

}
