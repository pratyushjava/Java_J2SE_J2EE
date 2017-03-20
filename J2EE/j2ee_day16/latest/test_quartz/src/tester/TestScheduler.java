package tester;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import jobs.*;

public class TestScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		try {
		new TestScheduler();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public TestScheduler() throws Exception{
		//get scheduler factory
		SchedulerFactory factory=new StdSchedulerFactory();
		//get scheduler from factory
		Scheduler sc=factory.getScheduler();
		System.out.println("init complete");
		//create job builder & specify job class
		JobDetail dtls=newJob(FirstJob.class).withIdentity("test_job","grp1").build();
		GregorianCalendar c1=new GregorianCalendar();
		c1.set(Calendar.MINUTE,37);
		Trigger trigger=newTrigger().withIdentity("test_trig","grp1").startAt(c1.getTime()).build();
		sc.scheduleJob(dtls, trigger);
		sc.start();
		
		System.out.println("press key to stop");
		System.in.read();
		System.out.println("shutting down scheduler");
		sc.shutdown(true);
		System.out.println("exiting....");
	}

}
