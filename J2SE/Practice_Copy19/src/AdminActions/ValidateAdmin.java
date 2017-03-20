package AdminActions;

import AdminPojos.AdminUserPojos;
import DAOS.AdminDao;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ValidateAdmin extends ActionSupport implements ModelDriven<AdminUserPojos>{
	
	AdminDao dao;
	AdminUserPojos au=new AdminUserPojos();
	AdminUserPojos au1;
	public ValidateAdmin() {
		System.out.println("in validate admin def constr...........");
		dao=new AdminDao();
	}

	@Override
	public AdminUserPojos getModel() {
		// TODO Auto-generated method stub
		return au;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in execute of admin validate........");
au1=		dao.AdminValidate(au);
if(au1!=null)
	return SUCCESS;
return ERROR;
		
		//return super.execute();
	}
	
	
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(au.getEmail().equals("") && au.getPassword().equals(""))
		{
			addFieldError("email", "email id can not be empty");
			addFieldError("password", "password can not be empty");
		}
		
		
		
		
		super.validate();
	}

}
