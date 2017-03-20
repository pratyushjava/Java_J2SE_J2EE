package simple_actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogOutAction extends ActionSupport implements SessionAware{
	Map<String,Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap=arg0;
		
	}
	@Override
	public String execute() throws Exception
	{
		((SessionMap<String,Object>)sessionMap).invalidate();
		return SUCCESS;
	}
	

}
