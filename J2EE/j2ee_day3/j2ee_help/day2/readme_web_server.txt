Steps in running Tomcat Apache web server (version 7.x or 6.x)
1. Extract the archive
2. set user env variable
2.1 set JAVA_HOME to JDK install dir.
eg C:\Program Files\Java\jdk1.7.0_03

2.2 set TOMCAT_HOME to tomcat install dir
eg C:\apache-tomcat-7.0.25

2.3 Add this env var only if server doesn't work
set CATALINA_HOME to tomcat install dir
eg C:\apache-tomcat-7.0.25

3 <Tomcat-install>/bin --- run startup.bat. It launches web server on http-8080 port. 
If port is used alrdy --- then server will give u JVM_BIND exception. 
In that case change the port no from <Tomcat-install>/conf/server.xml

4 Run thin client.
From web browser , give URL as : http://localhost:8080

Should show u Apache's welcome page.

5 How to add Apache tomcat to eclipse IDE?
Stop external Tomcat server & add new server to IDE

