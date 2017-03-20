package simple;

import org.springframework.stereotype.Component;

@Component("one")
public class PersonConfigImpl implements PersonConfig {

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return "ABC1";
	}

}
