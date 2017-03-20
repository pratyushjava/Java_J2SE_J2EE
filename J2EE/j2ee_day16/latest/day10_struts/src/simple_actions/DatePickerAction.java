package simple_actions;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class DatePickerAction extends ActionSupport {
	private Date regDate;
	private List<String> countries;
	private String country;
	
	

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
		System.out.println("date - "+regDate);
	}

	@Override
	public String execute() throws Exception {
		System.out.println("in exec datep");
		return super.execute();
	}

	public List<String> getCountries() {
		return Arrays.asList(new String[] {"India","Nepal","China","Malaysia"});
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
