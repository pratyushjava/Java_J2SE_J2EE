package simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person implements PersonIntf{
	@Autowired
	@Qualifier("two")
	private PersonConfig config;
	
	@Override
	public String getName() {
		return config.printName();
	}
	
	

}
