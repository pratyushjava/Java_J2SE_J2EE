package simple_actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import pojos.UserPOJO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<UserPOJO>,
		ServletContextAware, SessionAware {
	// ModelDriven type UserPOJO --- it must have default constr.
	private UserPOJO u = new UserPOJO();
	private ServletContext ctx;
	private Map<String, Object> sessionMap;// map of sess scoped attr names &
											// vals

	@Override
	public void setSession(Map<String, Object> arg0) {
		// arg0 -- map of session scoped attributes -- String attrName , Object
		// attr value.
		sessionMap = arg0;

	}

	@Override
	public void setServletContext(ServletContext arg0) {
		ctx = arg0;
	}

	@Override
	public UserPOJO getModel() {
		// TODO Auto-generated method stub
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// gets HM of users from Application scope
		HashMap<Integer, UserPOJO> hm = (HashMap<Integer, UserPOJO>) ctx
				.getAttribute("user_list");
		int id = u.getId();
		if (hm.containsKey(id)) {
			// if user id exists
			// NEVER change ref or create new model driven object in execute()
			// can use setter to modify existing model driven pojo
			// if u change the obj ref itself --- when u r using OGNL from JSPs
			// to refer to this object,
			// as value stack has only old ref --- data inconsistencies can
			// occur.
			UserPOJO user = hm.get(id);
			u.setName(user.getName());
			u.setSubAmt(user.getSubAmt());
			System.out.println("u=" + u);
			// adds user details to session scoped attribute
			//
			sessionMap.put("user_dtls", u);
			return SUCCESS;
		}
		return ERROR;
	}

	public UserPOJO getU() {
		return u;
	}

}
