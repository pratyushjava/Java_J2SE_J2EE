//err in using @PointCut annotation
package aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.Arrays;


@Aspect
public class LoggingAspectProb {
	//Code below define a point cut for ANY method of the Customer class having any 
	//ret type & any args
	@Pointcut("execution (* aop_demo.domain.Customer.*(..))")
	public void testMethod(){}
	
	@Pointcut("execution (* aop_demo.domain.Customer.addCustomerWithExc(..))")
	public void testMethod1(){}
	
	@Pointcut("execution (* aop_demo.domain.Customer.addCustomerAround(..))")
	public void testMethod2(){}
	
	
	//Spring AOP typically used along with method exec.
	//* -- any Ret type
	//(..) --any no of args ---0 to n
	//Intercepts before method exec of aop_demo.domain.Customer.addCustomer
	//having any ret type or any no of args
	@Before("execution (* aop_demo.domain.Customer.addCustomer(..))")
//	@Before("testMethod()")
	public void logBefore(JoinPoint point)
	{
		System.out.println("in logBefore");
		System.out.println("Intercepted "+point.getSignature().getName());
	}
	
	//advice to be applied ONLY if method return successfully
	
	//after meth exec interceptor -- any ret type ,any args , for any method o
	//of any class from domain pkg.
	
	@After("execution (* aop_demo.domain.Customer.*(..))")
	public void logAfter(JoinPoint p)
	{
		System.out.println("in log after ");
		System.out.println("Intercepted after "+p.getSignature().getName());
	}
	
	@AfterThrowing(pointcut="execution (* aop_demo.domain.Customer.addCustomerWithExc(..))",throwing="ex")
	public void logAfterExc(Exception ex)
	{
		System.out.println("Caught an exc in advice "+ex);
	}
	@Around("execution (* aop_demo.domain.Customer.addCustomerAround(..))")
	public Object logAroud(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("logAround() is running!");
		System.out.println("intercepted method : " + joinPoint.getSignature().getName());
		System.out.println("its arguments : " + Arrays.toString(joinPoint.getArgs()));
	 
		System.out.println("Around before is running!");
		Object ret=joinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
	 
		System.out.println("******");
		return ret;
	 

	}
}
