WHY JSP?

1. JSP allows developer to separate presentation logic(dyn resp generation)  from Business logic or data manipulation logic.
Typically JSPs -- used for P.L
Java Beans or Custom Tags(actions) --- will contain Business logic.

2. Ease of development --- JSP pages are auto. translated by W.C in to servlet & compiled & deployed.

3. Can use web design tools -- for faster dev. 

What is JSP?
Web page template(having HTML markup) , can embed Java code directly.

JSP life-cycle

1. Clnt sends the 1st request to the JSP (test.jsp)
2. Web-container invokes the life cycle for JSP
3. Translation Phase : handled by the JSP container.
I/p : test.jsp  O/p : test_jsp.java (name : specific to the Tomcat container)
Meaning : .jsp is translated into corr. servlet page(.java)
Translation time errs : syntacticle  errs in using JSP syntax.
In case of errs : life-cycle is aborted.
4. Compilation Phase : handled by the JSP container.
I/p : Translated servlet page(.java)   O/p : Page Translation class(.class)
Meaning : servlet page auto. compiled into .class file
Compilation time errs: syntacticle  errs in generated Java  syntax.
5. Request processing phase / Run time phase. : typically handled by the Servlet Container.
6. S.C : will try to locate,load,instantiate the generated servlet class.
7. The 1st it calls : public void jspInit() : one time inits can be performed.(jspInit avlble from javax.servlet.jsp.JspPage)
8. Then it will call using thrd created per clnt request : 
public void _jspService(HttpServlet Rq,HttpServletResponse) throws ServletException,IOException(API avlble from javax.servlet.jsp.HttpJspPage)

9.. At the end ...(server shutting down or re-deployment of the context) : the S.C calls
public void jspDestroy()
After this : inst. will be GCEd....

10 For 2nd req onwards ...... : SC will invoke step 8 onwards.




JSP 2.0/2.1 syntax
1. JSP comments

1.1 server side comment
syntax : <%-- comment text --%>
significance : JSP translator & compiler ignores the commented text.

1.2 clnt side comment
syntax : <!-- comment text -->
significance : JSP transalator & compiler does not ignore the commented text BUT clnt browser will ignore it.





2. JSP's implicit objects (available only to _jspService)
2.1 out - javax.servlet.jsp.JspWriter : represents the buffered writer stream connected to the clnt via HttpServletResponse(similar to ur PW in servlets)
Has the same API as PW(except printf)
usage eg : out.println("some text sent to clnt");

2.2 request : HttpServletRequest (same API)

2.3 response : HttpServletResponse

2.4 config : ServletConfig

2.4 session : HttpSession (By def. all JSPs participate in session tracking i.e session obj is created) 

2.5 exception : java.lang.Throwable (available only to err handling pages)

2.6 pageContext  : current page reference. : javax.servlet.jsp.PageContext

2.7 application : ServletContext(used for Request dispatching, server side logging, for creating context listeners)

2.8 page : 'this' of JSP.


3. Scripting elements : To include the java content within JSP : to make it dynamic.
3.1 Scriptlets : can add the java code directly . AVOID scriptlets . (till Javabeans we will use use the scriptlets to add : Req. processing logic, B.L & P.L)
syntax : <% java code...... %>
location inside the translated page : within _jspService
usage : till JBs  or cust. tags are introduced : scriptlets used for control flow/B.L/req. proc. logic


3.2 JSP expressions : 
syntax : <%= expr to evaluate %>

expr to evaluate : java method invocation which rets a value OR
const expr or attributes or variables.
location inside the translated page : within _jspService
signi : the expr gets evaluated---> to string -> auto. sent to clnt browser.




Better alternative to JSP Expressions : EL syntax (Expression Lang. : avlble from JSP 1.2 onwards)
syntax : ${expr to evaluate}

eg : ${param.f1} ---> request.getParameter("f1").toString()---> sent to browser
param : req. param map

3.3 JSP declarations (private members of the transalated servlet class)
syntax : <%! JSP declaration block %>
Usage : for creating page scoped java variables & methods 

location inside the translated page : outside any of life-cycle meths & within the translated servlet class.





EL syntax to be used in error handling pages 

ERR causing URI :  ${pageContext.errorData.requestURI }<br/>
 ERR code :  ${pageContext.errorData.statusCode}<br/>
 ERR Mesg :  ${pageContext.exception.message } <br/>
 Throwable : ${pageContext.errorData.throwable}<br/>
 Throwable Root cause: ${pageContext.errorData.throwable.cause}
 

JSP Directives --- commands/messages for JSP Engine(=JSP container=WC) -- to be used @Translation time. 

Syntax --- 
<%@ Directive name attrList %>
1. page directive
--- all commands applicable to current page only.
Syntax 
<%@ page import="comma separated list of pkgs" contentType="text/html" %>
Imp page directive attributes
1. import  --- comma separated list of pkgs
2. session --- boolean attribute. def=true.
To disable session tracking, spectify session="false"
3. errorPage="URI of err handling page" ---
tells WC to forward user to err handler page.
4. isErrorPage="true|false" def = false
If u enable this to true--- one can access 'exception' implicit object from this page.

This exception obj is stored under current page ---i.e under pageContext (type=javax.servlet.jsp.PageContext -- class which represents curnt JSP)
EL expresssion to display error mesg
${pageContext.exception.message}
-- evals to pageContext.getException().getMessage()

2. include directive
<%@ include file="URI of the page to be included" %>
Via include directive ---- contents are included @ Translation time.--- indicates page scope.
Typically used -- for including static content.

JSP Using JB
why JBs --- allows prog to sep. B.L in JB.
simple sharing of JBS across multiple web pages.
easy translation bet. req. params & JB props.

What is JB
1. pkged public Java class 
2. Must have def constr.
3. Props of JBs --- private, non-static , non-transient D.M  --- equivalent to request params sent by clnt.
In proper words --- Java bean props reflect the conversational state of the clnt.
4. per property  -- if RW
supply getter & setter.
Rules for setter
public void setPropertyName(Type val)
Type -- prop type.
eg -- private Date registrationDate;
public void setRegistrationDate(Date d)

Rules for getter
public Type getPropertyName()
Type -- prop type.
eg -- private Date registrationDate;
public Date getRegistrationDate()

5. Business Logic --- methods
public methods

Using Java Beans from JSP
Via standard actions
JSP actions ---- commands/mesgs meant for WC
to be interpreted @ translation time & applied @ req. processing time.(run time)

Syntax ---
<jsp:actionName attr list>Body of the tag/action
</jsp:actionName>
1. <jsp:useBean id="BeanRef name" class="F.Q. Bean class name" scope="page|request|session|application/>

def = page scope.

pre-requisite --- JB class exists under <WEB-INF>/classes.

eg --- beans.Userbean
props --- email,pass
setters/getters
B.L mehod -- for validation

Usage ---
<jsp:useBean id="user" class="beans.UserBean" scope="request/>

W.C invokes JB life-cycle
1. WC chks if specified Bean inst alrdy exists in specified scope
java api --- request.getAttribute("user")
---null=>JB doesn't exist
---loc/load/inst JB class
UserBean u1=new UserBean();
--add JB inst to the specified scope
java api -- request.setAttribute("user",u1);
--- not-null  -- WC continues....

2. JSP using JB action
2.1 <jsp:setProperty name="Bean ref Name" property="propName" value="propVal---static/dyn" />
Usage--
<jsp:setProperty name="user" property="email"
value="a@b"/>
WC invokes --- request.getAttribute("user").setEmail("a@b");

<jsp:setProperty name="user" property="email"
value="<%= request.getParameter("f1") %>"/>

OR via EL
<jsp:setProperty name="user" property="email"
value="${param.f1}"/>

WC invokes ---
request.getAttribute("user").setEmail(request.getParameter("f1"));

2.2 
<jsp:setProperty name="Bean ref Name" property="propName" param="rq. param name"/>

Usage eg --
<jsp:setProperty name="user" property="email" param="f1"/>

WC invokes ---
request.getAttribute("user").setEmail(request.getParameter("f1"));

2.3
<jsp:setProperty name="Bean ref Name" property="*"/>

usage

<jsp:setProperty name="user" property="*"/>
eg -- If rq. param names are email & password(i.e matching with JB prop names) then ---matching setters(2) will get called 

3. <jsp:getProperty name="Bean ref name" property="propName"/>
Usage -- 
<jsp:getProperty name="user" property="email"/>
WC ---
request.getAttribute("user").getEmail()--- toString --- sent to clnt borwser
Better equivalent  -- EL syntax
${user.email}


4.JSP std actions related to RD
RD's forward scenario
<jsp:forward page="dispatcher URI" />
RD's include scenario
<jsp:include page="dispatcher URI" />


Why JSTL ?
When JSP std actions are in-sufficient to solve B.L
w/o writing scriptlets --- use additional std actions --- supplied as JSTL actions
JSP standard Tag Library
--- has become std part of J2EE 1.5 onwards.
---suuport exists in form JAR ---
1. standard.jar 2. jstl.jar
For using JSTL steps
1.Add above JARs into ur run-time classpath
2. Use taglib directive to include JSTL tag library into ur JSP pages.
tag=action
tag library=collection of tags
supplier = JSTL verndor(spec vendor=Sun, JAR vendor=Sun/any J2EE compliant server)
jstl.jar,standard.jar --- consist of Tag implementation classes
Tag libr-   TLD -- Tag library descriptor -- desc of tags -- how to use tags
<%@ taglib uri="URI of JSTL tag lib" prefix="tag prefix" %>

eg --- To import JSTL core lib
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

3. Invoke JSTL tag/action
3.1 eg ---
<c:set var="abc" value="${param.f1}" scope="session"/>
WC invokes --- session.setAttribute("abc",request.getparameter("f1"));

menaing of <c:set> sets the specified attr to specified scope.

3.2 <c:forEach var="category" items="${shop.categories}">
${category.name}<br/>
</c:forEach>



var -- loop var
items -- any JB 's prop --- array based,coll based (List or set) map based.

Java syntax
for(Category c : categories)
out.write(c.getName()

How to set session tm out ?
1. programmatically --- using Java API
From HttpSession --- setMaxInactiveInterval(int secs)
2. declarativally -- either using Java annotations OR using XML config files (web.xml)







































































































































































































Note : when u dont specify form action , its submitted to the same page.




 































