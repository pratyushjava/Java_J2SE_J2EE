package DAOS;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Pojos.CityPojos;
import Pojos.FlightPojos;
import Pojos.HotelBookingPojos;
import Pojos.HotelPaymentPojos;
import Pojos.HotelPojos;
import Pojos.HotelUsersPojos;
import Pojos.PNRPojos;
import Pojos.PassangerPojos;
import Pojos.RoomPojos;
import Pojos.TempHotelDetailsPojos;
import Pojos.TicketPojos;
import Pojos.TypePojos;

import utils.HibernateUtils;



public class hib_dao {
	
	private ArrayList<FlightPojos> al=null;
	private ArrayList<CityPojos> alCity=new ArrayList<>();
	private PassangerPojos p1=new PassangerPojos();
	private TicketPojos tk;
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<FlightPojos> getOneWayFlightDetails(int source,int dest,String departdate,int Adult,int Children,int Infants)
	{
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		System.out.println("in dao fetching method");
		System.out.println("the to is"+dest);
		System.out.println("the from is"+source);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			System.out.println(sdf.parse(departdate));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String hql="from FlightPojos f  where f.to=:t  and f.from=:f and f.adult>=:ad and f.children>=:ch and f.infants>=:inf and f.departtime=:dd";
		
		System.out.println("after query");
		System.out.println(departdate);
	
		try
		{
			al=(ArrayList<FlightPojos>)ss.createQuery(hql).setParameter("t",dest )
					.setParameter("f", source).setParameter("ad", Adult).setParameter("ch", Children).setParameter("inf", Infants).setParameter("dd", sdf.parse(departdate)).list();
			
			System.out.println("in dao "+al);
			tx.commit();
		}
		catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			
				
		}
		finally
		{
			if(ss!=null)
				ss.close();
		}
		System.out.println("before returning");
		return al;
		
		
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<FlightPojos> getRoundTripFlightDetails(int source,int dest,String departdate,String arrivaldate,int Adult,int Children,int Infants)
	{
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		System.out.println("in dao fetching method");
		System.out.println("the to is"+dest);
		System.out.println("the from is"+source);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			System.out.println(sdf.parse(departdate));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String hql="from FlightPojos f  where f.to=:t  and f.from=:f and f.adult>=:ad and f.children>=:ch and f.infants>=:inf and f.departtime=:dd and f.arrivaltime=:aa";
		
		System.out.println("after query");
		System.out.println("the depart date is"+departdate);
		System.out.println("the arrival date"+arrivaldate);
	
		try
		{
			al=(ArrayList<FlightPojos>)ss.createQuery(hql).setParameter("t",dest )
					.setParameter("f", source).setParameter("ad", Adult).setParameter("ch", Children).setParameter("inf", Infants).setParameter("dd", sdf.parse(departdate))
					.setParameter("aa", sdf.parse(arrivaldate)).list();
			
			System.out.println("in dao "+al);
			tx.commit();
		}
		catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			
				
		}
		finally
		{
			if(ss!=null)
				ss.close();
		}
		System.out.println("before returning");
		return al;
		
		
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<FlightPojos> getFullFlights()
	{
		System.out.println("in dao starting");
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		try
		{
			String hql="from FlightPojos f ";
			al=(ArrayList<FlightPojos>)ss.createQuery(hql).list();
			System.out.println("in dao after query "+al);
			for (FlightPojos f : al) {
				//System.out.println(f.getDeparttime());
				
			}
				tx.commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		finally{
			if(ss!=null)
				ss.close();
		}
		return al;
	}
	
	//function get all city used to populate city in ---to--- and ---from--- list
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
	
	
	public int AddPassangerInfo(PassangerPojos p)
	{
		System.out.println("in add details info");
		int i=0;
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from FlightPojos  f where f.flightid=:f ";
		String hql1="from PassangerPojos pas where pas.emailid=:e";
	//	String hql3="select 'PNRTABLE_SEQ'.nextval  from dual ";
		//String hql3="select max(seqno) from SeqStorePojos";
		PassangerPojos pas1=new PassangerPojos();
		PNRPojos pnr=null;
		try
		{
			pas1=(PassangerPojos)ss.createQuery(hql1).setParameter("e", p.getEmailid()).uniqueResult();
			if(pas1==null)
			{
				pnr=new PNRPojos(p.getEmailid(), p.getFlight_id(), p.getFirstname(), p.getLastname(), p.getAdult(), p.getChildren(), p.getInfants());
				
			
			/*pnr.setPassangerid(p.getEmailid());
			pnr.setFlightid(p.getFlight_id());
			*/System.out.println("before query");
		i=	(Integer) ss.save(p);
		System.out.println("before saving to pnr");
		System.out.println(pnr);
	int pnrno=	(Integer)ss.save(pnr);
	System.out.println("the pnr no "+pnrno);
		System.out.println("in dao"+pnr.getPNR());
		System.out.println("after saving in pnr");
	FlightPojos fp=(FlightPojos)	ss.createQuery(hql).setParameter("f", p.getFlight_id()).uniqueResult();
	System.out.println(fp);
	System.out.println("before update adult"+fp.getAdult());
	System.out.println("before update child"+fp.getChildren());
	System.out.println("before update infants"+fp.getInfants());
	int adult=fp.getAdult()-p.getAdult();
	int child=fp.getChildren()-p.getChildren();
	int infant=fp.getInfants()-p.getInfants();
	System.out.println("the updated adult"+adult);
	System.out.println("the updated child"+child);
	System.out.println("the updated infants"+infant);
			
			int n=	ss.createQuery("update FlightPojos f set f.adult=:a,f.children=:c,f.infants=:i where f.flightid=:fid")
					.setParameter("a", adult).setParameter("c", child).setParameter("i", infant).setParameter("fid", p.getFlight_id()).executeUpdate();
			System.out.println(n);
				
		//int j=(Integer)ss.createQuery(hql3).uniqueResult();
		//System.out.println("the seq value"+j);
		
		tx.commit();
		
System.out.println("after commoit"+pnr.getPNR());



      /*   pas1=  (PassangerPojos) ss.createQuery(hql1).setParameter("e",p.getEmailid()).uniqueResult();
System.out.println(pas1);
pnr.setPassangerid(pas1.getPassangerId());
pnr.setFlightid(p.getFlight_id());
ss.save(pnr);
System.out.println("after saving pnr");

*/
			System.out.println("after commmit");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
		
		finally
		{
			if(ss!=null)
				ss.close();
		}
		return pnr.getPNR();
	}
	
	
	public PassangerPojos ValidatePassanger(PassangerPojos p)
	{
		System.out.println("in validate passanger method");
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from PassangerPojos p where p.emailid=:e and p.password=:p";
		
		
		try
		{
			
	p1=(PassangerPojos)ss.createQuery(hql).setParameter("e", p.getEmailid()).setParameter("p", p.getPassword()).uniqueResult();
	System.out.println(p1);
	System.out.println("after fetching ........");
	tx.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}finally
		{
			if(ss!=null)
				ss.close();
		}
		return p1;
		
	}
	
	
	public TicketPojos getTicketInfo(int Pnr)
	{
		PassangerPojos pas=null;
		FlightPojos fl=null;
		PNRPojos pnr=null;
		String result="res";
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from PNRPojos p where p.PNR=:pr";
		String hql1="from PassangerPojos pas where pas.emailid=:e";
		String hql2="from FlightPojos fl where fl.flightid=:f";
		try
		{
		pnr=	(PNRPojos)ss.createQuery(hql).setParameter("pr", Pnr).uniqueResult();
	   //pas=	(PassangerPojos)ss.createQuery(hql1).setParameter("e", pnr.getPassangerid()).uniqueResult();
		fl= (FlightPojos)ss.createQuery(hql2).setParameter("f", pnr.getFlightid()).uniqueResult();
		System.out.println("after fetching all ticket related record........");
		//tk=new TicketPojos(Pnr, pas.getFirstname(), pas.getLastname(), fl.getFare(), pas.getAdult(), pas.getChildren(), pas.getInfants());
		tk=new TicketPojos(Pnr,pnr.getFlightid(), pnr.getFirstname(), pnr.getLastname(),fl.getFare() , pnr.getAdult(), pnr.getChildren(), pnr.getInfants());
		System.out.println(tk);
		tx.commit();
		System.out.println("after commiting");
		
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}finally
		{
			if(ss!=null)
				ss.close();
		}
		
		
		return tk;
	}
	
	
	public int AddUserPassangerInfo(PassangerPojos p)
	{
		System.out.println("in add details info");
		int i=0;
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from FlightPojos  f where f.flightid=:f ";
		String hql1="from PassangerPojos pas where pas.emailid=:e";
		PassangerPojos pas1=null;
		PNRPojos pnr=null;
		try
		{
			 pas1=  (PassangerPojos) ss.createQuery(hql1).setParameter("e",p.getEmailid()).uniqueResult();
			 if(pas1!=null)
			 {
				 System.out.println("user exist");
		      	
			     System.out.println("before query");
		pnr=new PNRPojos(p.getEmailid(), p.getFlight_id(), p.getFirstname(), p.getLastname(), p.getAdult(), p.getChildren(), p.getInfants());
		       System.out.println("before saving to pnr");
		       System.out.println(pnr);
		   i=    (Integer)ss.save(pnr);
		       System.out.println("after saving in pnr");
	FlightPojos fp=(FlightPojos)	ss.createQuery(hql).setParameter("f", p.getFlight_id()).uniqueResult();
	System.out.println(fp);
	System.out.println("before update adult"+fp.getAdult());
	System.out.println("before update child"+fp.getChildren());
	System.out.println("before update infants"+fp.getInfants());
	int adult=fp.getAdult()-p.getAdult();
	int child=fp.getChildren()-p.getChildren();
	int infant=fp.getInfants()-p.getInfants();
	System.out.println("the updated adult"+adult);
	System.out.println("the updated child"+child);
	System.out.println("the updated infants"+infant);
			
			int n=	ss.createQuery("update FlightPojos f set f.adult=:a,f.children=:c,f.infants=:i where f.flightid=:fid")
					.setParameter("a", adult).setParameter("c", child).setParameter("i", infant).setParameter("fid", p.getFlight_id()).executeUpdate();
			System.out.println(n);
			
	
			 }
			 else
			 {
			i=	 AddPassangerInfo(p);
			System.out.println("after complete of else");
			 }
			 tx.commit();


      /*   pas1=  (PassangerPojos) ss.createQuery(hql1).setParameter("e",p.getEmailid()).uniqueResult();
System.out.println(pas1);
pnr.setPassangerid(pas1.getPassangerId());
pnr.setFlightid(p.getFlight_id());
ss.save(pnr);
System.out.println("after saving pnr");

*/
			System.out.println("after commmit");
			 
			
		}
		catch (Exception e) {
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

	ArrayList<HotelPojos> hp;
	ArrayList<RoomPojos> rp;
	TypePojos tp;
	//TempHotelDetailsPojos hd;
	ArrayList<TempHotelDetailsPojos> hd;
	ArrayList<HotelPojos> newhp;
	
	double price;
	@SuppressWarnings("unchecked")
	public ArrayList<HotelPojos> getHotelDetails(TempHotelDetailsPojos p)
	{
		System.out.println("in get hotel details");
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		System.out.println("before conv check in date"+p.getCheckindate());
		System.out.println("before conv check out date"+p.getCheckoutdate());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String checkin=getConvertdate(p.getCheckindate());
		String checkout=getConvertdate(p.getCheckoutdate());
		System.out.println("after conv check in"+checkin);
		System.out.println("after conv check out"+checkout);
		
		
		String hql="from HotelPojos hp where hp.city=:c and hp.no_of_ac_rooms>:r";
		
		/*String hql="hp.city,tp.typeid,tp.price from HotelPojos hp ,RoomPojos rp,TypePojos tp where hp.hotelid=rp.hotelid and rp.typeid=tp.typeid and hp.city=:c " +
				"  and tp.no_of_rooms>:r";
		*/
		String hql1="from RoomPojos rp where rp.checkindate!=:ch and rp.checkoutdate!=:co";
		String hql3="from TypePojos tp where tp.typeid=:t ";
		try
		{
			System.out.println("before fetching");
			System.out.println(p);
		/*hd=	(ArrayList<TempHotelDetailsPojos>)ss.createQuery(hql).setParameter("c", p.getCity())
				.setParameter("r", p.getNo_of_rooms()).list();
*/	
	hp=	(ArrayList<HotelPojos>)ss.createQuery(hql).setParameter("c", p.getCity()).setParameter("r", p.getNo_of_rooms()).list();
	rp=	(ArrayList<RoomPojos>)ss.createQuery(hql1).setParameter("ch", sdf.parse(checkin)).setParameter("co", sdf.parse(checkout)).list();
	tp=(TypePojos)ss.createQuery(hql3).setParameter("t", p.getType()).uniqueResult();
	System.out.println("hotel list"+hp);
	System.out.println("room list"+rp);
	System.out.println("type name"+tp);
		
		 newhp=new ArrayList<>();
		for (HotelPojos h : hp) {
			for (RoomPojos r : rp) {
				if(h.getHotelid()==r.getHotelid() && r.getTypeid()==tp.getTypeid())
				{
					System.out.println("in if");
					newhp.add(h);
					break;
				}
			}
		}
		
		/*rp=(ArrayList<RoomPojos>)ss.createQuery(hql1).setParameter("ch",sdf.parse(sb.toString()) ).
				setParameter("co", sdf.parse(sb1.toString())).list();
		System.out.println("after roompojos details"+rp);
		tp=(TypePojos)ss.createQuery(hql3).setParameter("t", p.getType()).setParameter("r", p.getNo_of_rooms()).uniqueResult();
		System.out.println("after type pojos details"+tp);
		*/tx.commit();
		System.out.println("the new hp"+newhp);
		System.out.println("after fetching price");
			
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}finally
		{
			if(ss!=null)
				ss.close();
		}
		if(hp==null && rp==null && tp==null)
		{
			hp=null;
		}
		return newhp;
		
		
	}
	
	
	/*public TypePojos getFullHotelDetails(int r1)
	{
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from RoomPojos rp where rp.hotelid=:h";
		try
		{
			
			
			
			
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
	}
*/	
	private String getConvertdate(String dd)
	{

		
		String str="";
		StringTokenizer stk=new StringTokenizer(dd, "-");
		while(stk.hasMoreTokens())
		{
		str=stk.nextToken()+"-"+str;
		}
		System.out.println(str);
		StringBuffer  sb=new StringBuffer(str);
		sb.deleteCharAt(10);
		System.out.println("the date is"+sb.toString());
		return sb.toString();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<RoomPojos> AddHotelUserDetails(HotelPaymentPojos hp,TempHotelDetailsPojos hd) throws ParseException
	{
		int i=0;
		HotelUsersPojos hu=null;
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		String checkin=getConvertdate(hd.getCheckindate());
		String checkout=getConvertdate(hd.getCheckoutdate());
		System.out.println("after conv check in"+checkin);
		System.out.println("after conv check out"+checkout);
		
		
		String hql="from RoomPojos rp where rp.typeid=:t and rp.hotelid=:h and rp.checkindate!=:ci and rp.checkoutdate!=:co";
		String hql1="from HotelUsersPojos hu where hu.emailid=:e";
		//String hql2="Insert into HotelUsers values(:e,:p)";
		HotelBookingPojos hb=new HotelBookingPojos(hp.getEmailid(), hp.getHotelid(),sdf.parse(checkin), sdf.parse(checkout), "NotBooked", hp.getFirstname(), hp.getLastname(), hp.getNo_of_room());
		System.out.println(hb);
		try
		{
			
		rp=	(ArrayList<RoomPojos>)ss.createQuery(hql).setParameter("t", hp.getType()).setParameter("h", hp.getHotelid())
				.setParameter("ci", sdf.parse(checkin)).setParameter("co", sdf.parse(checkout)).list();
		hu=(HotelUsersPojos)ss.createQuery(hql1).setParameter("e", hp.getEmailid()).uniqueResult();
			
		
		if(hu==null)
		{
			hu=new HotelUsersPojos(hp.getEmailid(), hp.getPassword());
			System.out.println("in if"+hu);
			//int a=ss.createSQLQuery(hql2).setParameter("e", hp.getEmailid()).setParameter("p", hp.getPassword()).executeUpdate();
		//	int a=ss.createQuery(hql2)..executeUpdate();
			int a=(Integer)ss.save(hu);
			System.out.println(hu);
			System.out.println(a);
		
		}
		
		
		
		
		
		
		/*for (RoomPojos r : rp) {
				
				if(r.getRoomstatus().equals("NotBooked"))
				{
					i++;
				}
				
			}
		*/	
		
		
		
		if(rp!=null )
			{
				int d=(Integer)ss.save(hb);
				System.out.println("saving details in table");
			System.out.println("ur hotel booking id"+d);
			}
			tx.commit();
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
		return rp;
	}
	
	
	public FlightPojos GetStatus(int pnr)
	{
		
		PNRPojos pnrDetails=null;
		FlightPojos flPojos=null;
		Session ss=HibernateUtils.getSession();
		Transaction tx=ss.beginTransaction();
		String hql="from PNRPojos p where p.PNR=:pr";
		String hql1="from FlightPojos f where f.flightid=:fid";
		try
		{
	pnrDetails=		(PNRPojos)ss.createQuery(hql).setParameter("pr", pnr).uniqueResult();
	System.out.println("the pnr details"+pnrDetails);
	flPojos=(FlightPojos)ss.createQuery(hql1).setParameter("fid", pnrDetails.getFlightid()).uniqueResult();
	System.out.println("the flight details"+flPojos);
			tx.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}finally
		{
			if(ss!=null)
				ss.close();
		}
		return flPojos;
	}
	
}
