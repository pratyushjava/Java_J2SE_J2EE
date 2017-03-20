What is Hibernate config.?

An instance of Configuration allows the application to specify properties and mapping documents to be used when creating a SessionFactory. 

An application will create a single Configuration, build a single instance of SessionFactory and then instantiate multiple Sessions in threads servicing client requests. 

The Configuration  : initialization-time object. 

SessionFactory :  immutable and does not reflect  any changes done later  to the Configuration.(hibernate.cfg.xml)

Implementation steps : forward approach
1. create web-appln
2. add hib. 4 jars to web-inf/lib
3.  create hibernate.cfg.xml : location  : run-time classpath(i.e under src : from IDE)
4. Identify persistence requirements & wrap it in POJO class
Features of Hib. based POJO/JPA based Entity
4.1 : public , pkged class, implements Serializable
4.2 Must provide def. constr.
4.3 can supply optionally paramed constr.
4.4 declare private D.M ---properties of POJO 
4.5 One property -- must be unique ID for POJO.


5. Generate the POJO.hbm.xml : to desc. the mapping to the Hib. frmwork OR use hibernate annotations to avoid writing HBM document


Annotation support from pkg : javax.persistence
Help for annotations :
5.1
1. Mark the entity or POJO class with @Entity annotation
@Entity : class level ---mandatory



2. @Table(name="upper cased table name") : class level annotation ---optional

3. @Id : can be field level or method level. ---mandatory
4. optional
@GeneratedValue(strategy=GenerationType.AUTO) --> id generator supplied by persistence  provider(app srvr's or ORM frmwork) & not by DB
Rule for Identifier property type---must be Serializable

5. @Column(name="upper-cased  col name ") --> not mandatory if same names

3,4,5 : applicable to Entity id property
6.@Column(name="upper-cased  col name") : for rest of prop to col names mapping(optional)	
eg : for additional @Column annotations (method level annotation)
@Entity
public class Flight implements Serializable {

@Column(updatable = false, name = "flight_name", nullable = false, length=50)
public String getName() { ... }



6. Run time steps : 
6.1 Create the singleton inst. of the Hib. SF -- in HibernateUtils class.(using static init block) --as annotation based entities are used --
Must use : org.hibernate.cfg.AnnotationConfiguration class inst-- configure the same-- then build session factory inst to the same
6.2 Use Context Listener class : to load HibernateUtils class -- so that via static block , singleon inst of the SF will be ready. 
One SF inst. will be typically created per web-appln & it will be closed via the same listener class -- when the web-appln is closing down.
6.2 Create Hib sesion.(using openSession) -- typically just before CRUD.(from DAO layer)
6.3 beginTx
6.4 perform CRUD operations(eg : save/persist/delete/update/HQL)
6.5 if no errs : commit Tx & close the session.--in case of errs , rollback the tx. & close Hib seesion.



How -to develop web - appln listeners ---
1. Developing Context listeners
1.1 - 1 Create Java class - as a Context listener class - by imple javax.servlet.ServletContextListener i/f
1.2  Imple the methods :
1. void contextInitialized(ServletContextEvent sce) -- called auto by WC -- @ context start-up.
2.void contextDestroyed(ServletContextEvent sce) -- called auto by WC -- @ context reload / undeploy/server shut down

1.3 Register the listener class with WC---add entry to web.xml to register ContextListener class with WC.


Objective 1 - simplest --- test hib frmwork -- using create(save method) & test get.

Hibernate session API -- for data retrieval

Usage of Hibernate Session API's get()
int id=101;
BookPOJO b1=(BookPOJO)hibSession.get(BookPOJO.class,id);


2. disp all books info : using HQL
eg --- HQL --- "from BookPOJO"
2.1 Create Query Object --- from Session i/f
org.hibernate.Query --- public Query createQuery(String hql) throws HE
2. Execute query to get List of selected PERSISTENT POJOs
API of Query i/f
 List<T> list();
 Usage ---
String hql="from BookPOJO";
List<BookPOJO> l1=hibSession.createQuery(hql).list();


3. Passing IN params to query.
Objective : Display all books with price < specified price.
API from Query i/f
String hql="from BookPOJO where price < : sp_price and author = :sp_auth";
List<BookPOJO> l1 = hibSession.createQuery(hql).setParameter("sp_price",user_price).setParameter("sp_auth",user_auth).list();


4. Updating POJOs
Objective : dec. price of all books with author=specified author.

5. Delete operations.


Annotations related to relationships

1. one <----> many : bi-directional
At one side : field level annotaion @OneToMany(cascade=CascadeType.ALL,mappedBy="propertyName in many side")
NOTE -- cascade is optional attribute. can be skipped .

At many side :
@ManyToOne
@JoinColumn(name="prim key column name of one side")

Meaning - Acts as Foreign key column referred from one side

eg -- Course 1----* Students
Table structure for understanding --- 
Course table --- course_id(PK),name,start_date,end_date,fees

Students table ---
id(PK),name,addr,course_id(FK)


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int courseId;
.....
@OneToMany(cascade=CascadeType.ALL,mappedBy="myCourse")
private List<Student> students;

In Student POJO
@ManyToOne
@JoinColumn(name="courseId")
private Course myCourse;
	
	
	




Annotation for Date
@Temporal(TemporalType.DATE)
private Date startDate;
Creates date type of column in underlying DB(java.util.Date or java.util.Calendar)
	

Annotation for Time
@Temporal(TemporalType.TIME)
private Date openingTime;
Creates time type of column in underlying DB

Annotation for TimeStamp
@Temporal(TemporalType.TIMESTAMP)
private Date closingDateTime;
Creates datetime type of column in underlying DB


More details on one ---many
The association may be bidirectional. In a bidirectional relationship, only one of the sides has to be the owner: the owner is responsible for the association column(s) update.

To declare a side as not responsible for the relationship, the attribute mappedBy is used. mappedBy refers to the property name of the association on the owner side.  You MUST NOT declare the join
column since it has already been declared on the owners side.













