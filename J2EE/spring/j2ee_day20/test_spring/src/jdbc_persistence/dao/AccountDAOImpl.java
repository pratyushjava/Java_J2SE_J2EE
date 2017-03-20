package jdbc_persistence.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class AccountDAOImpl implements AccountDAO {
	private SimpleJdbcCall callTemplate;

	
	@Override
	public void updateAccount(int srcId, int destId, double amt) {
		//for stored proc - refer to ---F:\software_src\My SQL 5.0.45\DDL.txt
		Map<String,Object> params=new HashMap<String,Object>();
		//IN param name & val pairs
		params.put("sid",srcId);
		params.put("did",destId);
		params.put("amt",amt);
	//	System.out.println("O/P of stored proc --- "+callTemplate.withProcedureName("update_account").execute(params));
		params=callTemplate.withProcedureName("update_account").execute(params);
		System.out.println("Updated sbal "+params.get("sbal")+" updated dest  bal "+params.get("dbal"));

	}


	public void setCallTemplate(SimpleJdbcCall callTemplate) {
		this.callTemplate = callTemplate;
	}
	

	
	

}
