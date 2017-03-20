package DAOS;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.*;

import com.sun.org.apache.regexp.internal.recompile;

import utils.HibernateUtils;
import AdminPojos.AdminUserPojos;
import Pojos.CityPojos;
import Pojos.FlightPojos;
import Pojos.HotelPojos;

public class AdminDao {
	FlightPojos flight_instance = null;
	ArrayList<CityPojos> alCity=new ArrayList<>();
	ArrayList<FlightPojos> alFlight=new ArrayList<>();

	public ArrayList<FlightPojos> insert(FlightPojos flight) throws Exception {
		System.out.println("in admin dao in insert");
		Session sess = HibernateUtils.getSession();
		Transaction tx = sess.beginTransaction();
		flight_instance = new FlightPojos();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm");
System.out.println(flight);
		try {
			flight_instance.setFare(flight.getFare());
			flight_instance.setDeparttime(sdf.parse(flight.getDepartdate()));
			flight_instance.setArrivaltime(sdf.parse(flight.getArrivaldate()));
			flight_instance.setFrom(flight.getFrom());
			flight_instance.setTo(flight.getTo());
			flight_instance.setAdult(flight.getAdult());
			flight_instance.setChildren(flight.getChildren());
			flight_instance.setInfants(flight.getInfants());
			
System.out.println("aftre setting flight_insab=nce");
			sess.save(flight_instance);
			System.out.println("aftre save");
			
			String hql="from FlightPojos ";
			alFlight=(ArrayList<FlightPojos>)sess.createQuery(hql).list();
			System.out.println(alFlight);
			
			tx.commit();
			System.out.println("INSERTED");
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();

			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return alFlight;
		}// end of insert function
	
	
	public String update(FlightPojos flight) throws Exception {
		System.out.println("in update method");
		Session sess = HibernateUtils.getSession();
		Transaction tx = sess.beginTransaction();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm");
		try {
			String hql = "update FlightPojos f set f.fare=:newFare,f.departtime=:newDeparttime,f.arrivaltime=:newArrivalTime,f.from=:newSource,f.to=:newDestination,f.adult=:newAdultsno,f.children=:newChildno,f.infants=:newInfantsno where f.flightid=:fl";
			/*Query q=sess.createQuery(hql);
			q.setDouble("newFare",flight.getFare());
			q.setDate("newDepartime",sdf.parse(flight.getDepartdate()));
			q.setDate("newArrivalTime",sdf.parse(flight.getArrivaldate()));
			q.setInteger("newSource",flight.getFrom());
			q.setInteger("newDestination",flight.getTo());
			q.setInteger("newAdultsno",flight.getAdult());
			q.setInteger("newChildno",flight.getChildren());
			q.setInteger("newInfantsno",flight.getInfants());
			int rowAffected = q.executeUpdate();
			*/
int rowAffected=sess.createQuery(hql).setParameter("newFare", flight.getFare()).setParameter("newDeparttime", sdf.parse(flight.getDepartdate())).
setParameter("newArrivalTime",sdf.parse(flight.getArrivaldate())).setParameter("newSource",flight.getFrom()).
setParameter("newDestination",flight.getTo()).setParameter("newAdultsno",flight.getAdult()).
setParameter("newChildno",flight.getChildren()).setParameter("newInfantsno",flight.getInfants()).setParameter("fl", flight.getFlight_id()).executeUpdate();
			
			
			System.out.println("no. of row affected: "+rowAffected);
			tx.commit();
			
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();

			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return "sucess";
	}//end of update  function	
	
	
	public String Hotelupdate(HotelPojos hp) throws Exception {
		System.out.println("in update method");
		Session sess = HibernateUtils.getSession();
		Transaction tx = sess.beginTransaction();
		HotelPojos hp1;
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm");
		try {
			String hql1="from HotelPojos h where h.hotelid=:he";
		//	String hql = "update FlightPojos f set f.fare=:newFare,f.departtime=:newDeparttime,f.arrivaltime=:newArrivalTime,f.from=:newSource,f.to=:newDestination,f.adult=:newAdultsno,f.children=:newChildno,f.infants=:newInfantsno where f.flightid=:fl";
			/*Query q=sess.createQuery(hql);
			q.setDouble("newFare",flight.getFare());
			q.setDate("newDepartime",sdf.parse(flight.getDepartdate()));
			q.setDate("newArrivalTime",sdf.parse(flight.getArrivaldate()));
			q.setInteger("newSource",flight.getFrom());
			q.setInteger("newDestination",flight.getTo());
			q.setInteger("newAdultsno",flight.getAdult());
			q.setInteger("newChildno",flight.getChildren());
			q.setInteger("newInfantsno",flight.getInfants());
			int rowAffected = q.executeUpdate();
			*/
/*int rowAffected=sess.createQuery(hql).setParameter("newFare", flight.getFare()).setParameter("newDeparttime", sdf.parse(flight.getDepartdate())).
setParameter("newArrivalTime",sdf.parse(flight.getArrivaldate())).setParameter("newSource",flight.getFrom()).
setParameter("newDestination",flight.getTo()).setParameter("newAdultsno",flight.getAdult()).
setParameter("newChildno",flight.getChildren()).setParameter("newInfantsno",flight.getInfants()).setParameter("fl", flight.getFlight_id()).executeUpdate();
*/			
	//hp1=		(HotelPojos)sess.createQuery(hql1).setParameter("he", hp.getHotelid()).uniqueResult();
//	hp1=hp;
	//System.out.println("the details are"+hp1);
	sess.update(hp);
		//	System.out.println("no. of row affected: "+rowAffected);
			tx.commit();
			
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();

			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return "sucess";
	}//end of update  function	
	

	
	
	public ArrayList<CityPojos> getAllCity()
	{
		System.out.println("in get city of dao strting");
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		try
		{
			String hql="from CityPojos";
		alCity=	(ArrayList<CityPojos>)ss.createQuery(hql).list();
		System.out.println("in city dao after fetching...... ");
		tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		finally{
			if(ss!=null)
				ss.close();
		}
		return alCity;
	}

	
	

	public String delete(int flightId) throws Exception {
System.out.println("in delete dao........");
System.out.println("the flight id is"+flightId);
		Session sess = HibernateUtils.getSession();
		Transaction tx = sess.beginTransaction();
		FlightPojos fp=new FlightPojos();
String hql1="from FlightPojos fp where fp.flightid=:f";
		try {
			/*String hql = "delete from Flights where flight_id=:f";
			*/
			
			Query q = sess.createQuery(hql1);
			/*int rowAffected = q.executeUpdate();*/
	fp=(FlightPojos)q.setParameter("f", flightId).uniqueResult();
	System.out.println("the pojo details"+fp);
			//System.out.println("no of row deleted" + rowAffected);
	sess.delete(fp);
	System.out.println("data  is deletd.......");
			tx.commit();
			System.out.println("DELETED..,.,.,,.,.");
			return "sucess";
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();

			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
	}// /end of delete function

	public String Hoteldelete(int hotelId) throws Exception {
		System.out.println("in delete dao........");
		System.out.println("the flight id is"+hotelId);
				Session sess = HibernateUtils.getSession();
				Transaction tx = sess.beginTransaction();
			//	FlightPojos fp=new FlightPojos();
				HotelPojos hp=new HotelPojos();
		String hql1="from HotelPojos hp where hp.hotelid=:f";
				try {
					/*String hql = "delete from Flights where flight_id=:f";
					*/
					
					Query q = sess.createQuery(hql1);
					/*int rowAffected = q.executeUpdate();*/
			hp=(HotelPojos)q.setParameter("f", hotelId).uniqueResult();
			System.out.println("the pojo details"+hp);
					//System.out.println("no of row deleted" + rowAffected);
			sess.delete(hp);
			System.out.println("data  is deletd.......");
					tx.commit();
					System.out.println("DELETED..,.,.,,.,.");
					return "sucess";
				} catch (Exception e) {
					if (tx != null)
						tx.rollback();

					throw e;
				} finally {
					if (sess != null)
						sess.close();
				}
			}// /end of delete function

	
	public ArrayList<FlightPojos> showflights() throws Exception 
	{
		String hql = "from FlightPojos";
		Session sess = HibernateUtils.getSession();
		Transaction tx = sess.beginTransaction();

		flight_instance=new FlightPojos();
		try {
			alFlight=(ArrayList<FlightPojos>) sess.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();

			throw e;
		} finally {
			if (sess != null)
				sess.close();
		}
		return alFlight;
	}	
	
	
	public AdminUserPojos AdminValidate(AdminUserPojos au)
	{
		AdminUserPojos au1=null;
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from AdminUserPojos au where au.email=:e and au.password=:p";
		try
		{
		au1=(AdminUserPojos)	ss.createQuery(hql).setParameter("e", au.getEmail()).setParameter("p", au.getPassword()).uniqueResult();
			System.out.println("in dao "+au1);
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		finally
		{
			if(ss!=null)
				ss.close();
		}
		return au1;
	}
	public int AddHotels(HotelPojos hp)
	{
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
	int i=0;	
		try
		{
		i=(Integer)ss.save(hp);
		tx.commit();
		System.out.println("after saving hotel details");
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		finally
		{
			if(ss!=null)
				ss.close();
		}
		return i;
	}
	
	public ArrayList<HotelPojos> getAllHotels()
	{
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from HotelPojos";
		ArrayList<HotelPojos> al=null;
		try
		{
	//	i=(Integer)ss.save(hp);
		al=(ArrayList<HotelPojos>)	ss.createQuery(hql).list();
		System.out.println("in dao get all hotels "+al);
		tx.commit();
		System.out.println("after fetching hotel details");
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		finally
		{
			if(ss!=null)
				ss.close();
		}
		return al;
	}
	
}
