package aop_demo.domain;

public interface CustomerIntf {
	void addCustomer();//to be used with @Before ,@After
	String addCustomerRetValue();//@AfterReturning
	void addCustomerWithExc() throws Exception;//@AfterThrowing
	void addCustomerAround(String s);//@Around
}
