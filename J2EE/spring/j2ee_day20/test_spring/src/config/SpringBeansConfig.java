package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import simple.Person;
import simple.PersonConfig;
import simple.PersonConfigImpl1;
import simple.PersonIntf;
import beans_anno.*;

//to tell spring IOC cont --- 
@Configuration
public class SpringBeansConfig {
	@Bean(name = "hello1")
	public HelloBeanIntf getHellBean() {
		return new HelloBean();
	}

	@Bean(name="two")
	public PersonConfig getBean()
	{
		return new PersonConfigImpl1();
	}
	@Bean(name="person")
	public PersonIntf getPersonBean() {
		return new Person();
	}

}
