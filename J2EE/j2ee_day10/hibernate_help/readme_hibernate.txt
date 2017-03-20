Why use Hibernate?
J2EE developer does not have to use JDBC API & manage data persistence at RDBMS level. No need to go to Table/Query/Column level.
One can set up Hibernate framework , create transient POJOs & then rely entirely on Hib. frmwork to manage persistence



Hibernate Frmwork --- popular ORM Tool
Transparent persistence provider.(As POJOs or Entities are not bound to any Persistence API ---  its written completely independent of Persistence Provider.)

--Fully supports OOP features --- association,inheritance.

--can persist object graphs , consisting of asso. objects

--caches data which is fetched repeatedly (via L1 & L2 cache) -- thus reduces DB traffic(L1 cache - at session level -- built in. L2 cache - pluggable) (More on caching at end of document)

--supports lazy loading -- thus increases DB performance.
(Meaning --- Lazy fetching—The associated object or collection is fetched “lazily,” when it’s first accessed. This results in a new request to the database (unless the associated object is cached). Eager fetching—The associated object or collection is fetched together with the owning object, using an SQL outer join, and no further database request is required.

--supports Objectified version of SQL -- HQL --works on objects & properties
--Hibernate usually obtains exactly the right lock level automatically . so developer need not worry about applying Read/Write lock.

Some basics 

1. Hibernate uses runtime reflection to determine the persistent properties of a class. 

2.
The objects to be persisted(called as POJO or Entity) are defined in a mapping document or marked with annotations.
Either these HBM XML docs or annotations serves to describe the persistent fields and associations, as well as any subclasses or proxies of the persistent object. 

3.

The mapping documents or annotations are compiled at application startup time and provide the framework with necessary information for a persistent class.
4.

What is Hibernate config.?

An instance of Hib Configuration allows the application to specify properties and mapping documents to be used at the frmwork start-up.
The Configuration  : initialization-time object. 

5.

SessionFactory is created from the compiled collection of mapping documents . 
The SessionFactory provides the mechanism for managing persistent classes, the Session interface. 
 
6.
A web application or Java SE apllication will create a single Configuration, build a single instance of SessionFactory and then instantiate multiple Sessions in threads servicing client requests. 

SessionFactory :  immutable and do not reflect  any changes done later  to the Configuration.

7. The Session class provides the interface between the persistent data store and the application. 
The Session interface wraps a JDBC connection, which can be user-managed or controlled by Hibernate.


Hibernate Session 

A Hibernate Session  is a set of managed entity instances that exist in a particular data store. 


Managing an Entity Instance’s Life Cycle

You manage entity instances(or POJOs) by invoking operations on the entity/POJO  using EntityManager/Session instance. 

Entity instances are in one of four states  (2 imp aspects of it : its asso. with the hibernate session & sync of its state with the underlying DB)

States : new or transient , managed or persistent, detached, removed.

New entity instances have no persistent identity and are not yet associated with a hib. session (transient)

Managed entity instances have a persistent identity and are associated with a hib. session.(persistent : via save() or saveOrUpdate()) Changes to DB will be done when tx is commited.

Detached entity instances have a persistent identify and are not currently associated with a persistence context/Hib session.

Removed entity instances have a persistent identity, are associated with a persistent context and are scheduled for removal from the data store.(invoked session.remove())

Introduction to Hibernate Caching

While working with Hibernate web applications we will face so many problems in its performance due to database traffic. That too when the database traffic is very heavy . Actually hibernate is well used just because of its high performance only. So some techniques are necessary to maintain its performance. 

Caching is the best technique to solve this problem. 

The performance of Hibernate web applications is improved using caching by optimizing the database applications. 

The cache actually stores the data already loaded from the database, so that the traffic between our application and the database will be reduced when the application want to access that data again. 
At maximum the application will work with the data in the cache only. Whenever some another data is needed, the database will be accessed. Because the time needed to access the database is more when compared with the time needed to access the cache. So obviously the access time and traffic will be reduced between the application and the database. 
Here the cache stores only the data related to current running application. In order to do that, the cache must be cleared time to time whenever the applications are changing. Here are the contents.


Lazy fetching (becomes important relationships)
When a client requests an entity(eg - Course POJO) and its associated graph of objects(eg -Student POJO)  from the database, it isn’t usually necessary to retrieve the whole graph of every (indirectly) associated
object. You wouldn’t want to load the whole database into memory at once;
eg: loading a single Category shouldn’t trigger the loading of all Items in that category(one-->many)








