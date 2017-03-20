What is struts
 
Its web application framework -- based upon (Filter Controlller ) MVC .
Vendor - Apache 

Why Struts 2 ? 

The Struts MVC framework is created for developers - to build servlets or JSPs  in which database code, page design code and control flow code is not mixed .

Applications that have code intermixed - are difficult to maintain as they grow larger. 

The Struts framework is based on the MVC architecture, which helps developers create dynamic Web applications with clear separation of concerns.(concerns = tasks or logic)

The Struts 2 framework provides -
1.Controller - Its own  Web controller component for handling control-flow logic.

 2. View - can  integrate with JSPs (including JSTL and JSF), Velocity Template Engine and XSLT. 

2. Model - uses technologies such as JDBC, EJB, Hibernate or iBATIS for data access.

What is Struts 2 ?
Struts 2 is Struts 1(Apache supplied modified/enhanced version ) + XWork2(Open Symphony community supplied)

What are Jobs of FilterDispatcher?
(org.apache.struts2.dispatcher.FilterDispatche)
Its Master filter for Struts.

 Executes actions
Creates &  Cleans up the ActionContext 
 Serves static content
 Starts XWork's interceptor chain for the  request lifecycle

What is ActionContext ?
(com.opensymphony.xwork2.ActionContext)

The ActionContext is the context(env)  in which an Action is executed. Each context contains objects an action needs for execution like the session, parameters, locale, etc.

The ActionContext is thread local ---  which means that values stored in the ActionContext are unique per thread. 
i.e Progs need not worry about thread safety.

Struts 2 features 

1. Improved design: Unlike Struts 1, all of the Struts 2 classes are based on interfaces. Core interfaces are HTTP independent , not dependent on Servlet APIs.

2. Simplified Actions: Struts 2 Action classes are framework independent and are simple POJOs.  Any Java class with an execute() method can be used as an Action class.

3. Intelligent defaults:Most of the config elems will have def. vals. So reduces the XML config. Also supports annotations , to achieve zero-config.
    

4. Introduction to  interceptors: Struts 2 provides support for interceptors. 
They  can be execute before and after an Action class is executed. 
Interceptors are configured to apply common functionality(concerns)  such as workflow or validation, file upload etc.  All the requests pass through a set of interceptors before they are sent to an Action class. After the Action class is executed, the request passes through the interceptors again in the reverse order.
    

5 Ajax support: To create dynamic Web applications that use Ajax, Struts 2 provides an Ajax theme.

6. QuickStart: Deployed configuration files are reloadable; hence, many changes can be made on the fly without the need to restart the Web container.
   
7.  Stateful checkboxes: The Struts 2 framework automatically tracks checkboxes; if a checkbox is missing, the default value -- false -- is assumed. 
     
8. Easy testing: Struts 2 Actions are HTTP independent and thus framework neutral. They can be tested easily without using mock objects.

9. Easy integration with Spring: Struts 2 Actions are Spring-aware. Just adding Spring beans to an application adds Spring support.

Struts 2 architecture basics

Based on MVC architecture.

Its a flexible control layer based on standard technologies such as Java filters, JavaBeans, ResourceBundles, Locales and XML + Open Symphony packages like OGNL(Object Graph Navigation language)  and XWork.

Model - Sturts 2 actions can integrate with any standard data access technologies such as JDBC,EJB,Hibernate, iBATIS 

View - Frmwork can use JavaServer Pages (including JSTL and JSF), Velocity templates, PDF, XSLT and FreeMarker for rendering view.

Exception handlers - can be declared in config xmls -  for defining a global exception and a local exception.  no need to write try/catch blocks in the code .  The framework catches each exception and displays a page with an appropriate message and exception details.
eg - 
<global-results>
<result name="error">/Error.jsp</result>
</global-results>
<global-exception-mappings>
<exception-mapping exception="java.lang.Exception" result="error"/>
</global-exception-mappings>

Main Additional components of Struts 2 archiecture (added after Struts 1)

1. Interceptors -  specify the request-processing life cycle for an action. Interceptors specify the sequence of actions that happen before and after the Action class is executed. Used to apply common functionality to a request. They  allow common, cross cutting tasks to be
defined in clean, re-usable components that you can keep separate from your action code.
eg : logging,params,validations,file-upload,workflow,i18n...

2. ValueStack --- Struts 2 uses the ValueStack as a storage area for all application  data that will be needed during the processing of a request.

Simple Basics ---  For each action invocation , Value stack object is created before execute method of action(which contains B.L logic --supplied by Prog.)  is called.
It stores action & other objects.
Structure of V.S. 

--- Contains Stack of Objects(eg action,model object --- object 0, object 1 ....object n ) + 
Context Map --- contains following

1 parameters --- rq param map
2 request -- rq scoped attr map
3 session --- session scoped attr map
4 application --application scoped attr map
5 attr --- map that searches for attrs in order req,session,application




2.1 Data is stored on  to the ValueStack during  rq. processing done by the inetrceptors.
2.2 V.S is Updated during action execution.
2.3 Read from there when the results render their response pages.

3. OGNL --Struts 2 's powerful expression language. 
Used to read & update properties on the ValueStack.
Example usage -- Can use  OGNL to bind HTML form fields to data objects on the ValueStack for data transfer.
Can use OGNL to pull data into the rendering of your JSP's and other result types.

Prefix # if u want to access objs from Context map
eg : In JSP -- below will get value of action propery named ---  email
 <s:property value="email"/>

below will get value of Rq param named email : <s:property value="#parameters.email"/> 

below will get value of appln scoped attr name use_list(if its a HM then can extract keys using keySet() or values using values())
<s:property  value="#application.user_list.values()"/>

below will get value of session scoped attr set by Business action class.
<s:property  value="#session.u_dtls"/>
Struts 2 request processing flow

Simpler flow ---

   1.

      When the user performs an action on the Web application, the Web browser sends a request for some resource to the Web server.
   2.

      The request is received by the servlet filter dispatcher, which looks at the request and determines the appropriate Action to be invoked to serve it.
   3.

      The set of interceptors configured for applying some common functionality to the request -- validation, workflow, or file upload etc - are automatically applied to the request before the Action is executed.
   4.

      A new instance of the Action class is created and then the action method is executed for storing or retrieving information to or from a database.
   5.

      The output -- be it HTML, images, PDF, or in some other format -- is rendered by the result.
   6.

      Then the request traverses through the interceptors in the reverse order. The returning request allows for the performance of additional processing or clean-up operations.
   7.

      Finally, the container sends the output to the browser.

Detailed internals -----

1. Clnt request goes to the servlet container (eg Tomcat WC).
where it is then passed through a chain of filters.
 
2. 1st filter - Passes optionally thro' ActionContextCleanUp filter -used only  when integrating with other technologies such as Site Mesh plug-ins. 

3. Req. passes to FilterDispatcher(servlet-filter). F.D. uses the ActionMapper to determine if  there is a need to invoke an action for this request. If the ActionMapper determines that an Action should be invoked, the FilterDispatcher delegates the control to the ActionProxy.

4.The ActionProxy consults the framework configuration files manager(which is  initialized from the user created struts.xml file). 

5.Then the ActionProxy creates an ActionInvocation, which is responsible for implementing the command pattern. The ActionInvocation process invokes the required interceptors(before the action)  and then invokes an Action.

6. When   Action is executed - i.e  typically : execute() will be called & it rets the result of the business logic.


7. ActionInvocation matches the returned result code with proper result (JSP) associated with the Action - by consulting struts.xml.
eg : of typical action config in struts.xml
pass-thro' action - invokes JSP directly
<action name="Name">           			<result>NameCollector.jsp</result>
</action>	
proper action - Here if the execute() from actions.HelloWorld rets 'SUCCESS' , then ActionInvocation
<action name="HelloWorld" class="actions.HelloWorld">
<result name="SUCCESS">/HelloWorld.jsp</result>
</action>

8.Result page (mostly JSP is rendered) is then executed.

9. Interceptors are executed again after completing the Action in the reverse order. The response returns through the filters configured in web.xml. 

10.Either of the ActionContextCleanUp filter or FilterDispatcher will clean up ThreadLocal ActionContext (i.e everything asso with current req + resp) 

Imp concepts ---
1.
Introduction to  interceptors: Struts 2 provides support for interceptors. 
They  can be executed before and after an Action class is executed. 
Interceptors are configured to apply common functionality(concerns)  such as workflow or validation, file upload etc.  All the requests pass through a set of interceptors before they are sent to an Action class. After the Action class is executed, the request passes through the interceptors again in the reverse order.

some std interceptors ----params
validator
file-upload
exception
workflow
i18n
modeldriven

Which are  different result types typically used ?
1. default type=dispatcher --- typically meant forer to JSP/HTML

2. type=chain ---- for action chaining.
eg : <action name="action1" class="....">
<result type="chain">action2</result>
</action>

Meaning ---action1 is chianed to action2  -- action1 & action2 are both on value stack, having action2 obj sitting at top.
(action scope not yet over)

3.type="redirect" --- re-directs to new resource, in next request.
equivalent to sendRedirect
Redirection removes asso with earlier action , as redirection has new URL
4. type=redirectAction ---- sendRedirect for new action.







