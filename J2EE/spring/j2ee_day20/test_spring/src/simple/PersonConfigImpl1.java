package simple;

import org.springframework.stereotype.Component;

@Component("two")
public class PersonConfigImpl1 implements PersonConfig {

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return "ABC2";
	}

}
