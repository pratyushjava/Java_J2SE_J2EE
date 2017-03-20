package simple_actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	// D.M ---props
	// prop names MUST match with rq param names
	// Only then params interceptor -- will invoke matching setters
	private String uName,uPass;
	private Date regDate;
	
	public RegisterAction() {
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
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	//B.L
	@Override
	public String execute() throws Exception {
		System.out.println("in exec of reg action");
		return SUCCESS;
	}
	

}
