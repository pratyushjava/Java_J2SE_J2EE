Config. steps for the pooled connectivity
MUST Copy JDBC drvr jar(ojdbc14.jar/ojdbc6.jar/mysql connector jar) to tomcat-home/lib
0. stop the srvr.
Ref Doc : <TomCat_Home>\webapps\docs\jndi-datasource-examples-howto.html

1. Open server.xml (<eclipse_ws>\Servers\Tomcat v7.0 Server at localhost-config\server.xml & edit the your web-appln's (Context) entry.
Within the <Context tag: add JDBC resource def.
 eg : 
<Context docBase="day9" path="/day9" reloadable="true" source="org.eclipse.jst.jee.server:day9">
      <Resource name="jdbc/ora_pool" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:orcl"
              username="scott" password="tiger" maxActive="5" maxIdle="2"
              maxWait="-1"/> 
      
      </Context>

2. Open ur web-appln's web.xml(WebContent\web-inf\web.xml)

copy the Resource - ref. tag in web.xml

eg :
<resource-ref>
 <description>Oracle Datasource example</description>
 <res-ref-name>jdbc/ora_pool</res-ref-name>
 <res-type>javax.sql.DataSource</res-type>
 <res-auth>Container</res-auth>
</resource-ref>

ENSURE : res-ref-name matches with Resource name added in server.xml

3. Continue to API (For Pooled cn based DAO)
Steps 
1. Get Initiail Context(javax.naming.InitialContext) --- Naming service similar to RMIRegistry & Naming class(in rmi setups)
---Specification from Sun & imple must be provided by web-srvr & app -srvr vendors.
2. From IC --- get DataSource ---ref to the connection pool -- created at the time of srvr start up.
3.From DataSource --- getConnection --- represents pooled out cn inst.
type=java.sql.Connection



How- to - for cn pool - Tomcat 7.0.20 & MySQL

<Context docBase="emp_web1" path="/emp_web1" reloadable="true"
					source="org.eclipse.jst.jee.server:emp_web1">
					<Resource name="jdbc/mysql_pool" auth="Container"
						type="javax.sql.DataSource" maxActive="3" maxIdle="1" maxWait="-1"
						username="root" password="root" driverClassName="com.mysql.jdbc.Driver"
						url="jdbc:mysql://localhost:3306/testjdbc" />


</Context>

& corresponding entry in web.xml - similar to oracle cn.
<resource-ref>
  	<res-ref-name>jdbc/mysql_pool</res-ref-name>
  	<res-type>javax.sql.DataSource</res-type>
  	<res-auth>Container</res-auth>
  </resource-ref>


How - to - set DS (=interface --- javax.sql.DataSource --- represents conn pool)
in JBoss 5.1
0 stop jboss srvr.
1. Add JDBC drvr Jars in <jboss_home>\server\default\lib
2. Copy jboss-ds.xml in <jboss_home>\server\default\deploy & make changes as per ur settings. (dburl,username,password, max conns)

If EJB is going to use Conn pool : DONT take step 3 & 4. 
Go directly for step 6.

3. Create follo. entries in ur web.xml
<resource-ref>
    <res-ref-name>ora_pool</res-ref-name>
    <res-type>javax.sql.DataSource</res-type>
    <res-auth>Container</res-auth>
    <mapped-name>java:/ora_pool</mapped-name>
   </resource-ref>
  <resource-ref>
    <res-ref-name>MYSQLDB</res-ref-name>
    <res-type>javax.sql.DataSource</res-type>
    <res-auth>Container</res-auth>
    <mapped-name>java:/MySQLDB</mapped-name>
   </resource-ref>
4. test jstl code 1st which uses : datasource=res-ref-name(ora_pool)
5. For performing look-up : from DAO layer or servlet java:comp/env had to be replaced by  : 
ds=(DataSource) ctx.lookup("java:ora_pool"); 
6. If SLSB /SFSB/Servlet/JB wants to access DS --- 
Field level anno ---
@Resource(mappedName="java:/ora_pool")
OR
@Resource(mappedName="java:/MySQLDB")
private DataSource ds;




