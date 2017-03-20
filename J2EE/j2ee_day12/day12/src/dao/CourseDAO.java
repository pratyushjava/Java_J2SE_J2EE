package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtils;
import java.util.*;
import pojos.*;

public class CourseDAO {
	// add new Course
	public void addCourse(Course c1) throws Exception {
		Session hs = HibernateUtils.getSession();
		Transaction tx = hs.beginTransaction();
		try {
			hs.save(c1);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();
		}
	}

	// add student to Course
	public void addStudent(String name, Student s1) throws Exception {
		Session hs = HibernateUtils.getSession();
		Transaction tx = hs.beginTransaction();
		ArrayList<Student> al = null;
		try {
			// get Course with matching name
			String hql = "from Course c where c.name=:name";
			//stmt below will raise Hib Exc --- if course names are dup.
			Course c1 = (Course) hs.createQuery(hql).setParameter("name", name)
					.uniqueResult();
			// retrieving all student from selected course
			List<Student> l1 = c1.getStudents();
			System.out.println("l1= "+l1+" course "+c1.getName());
			// specify course for  student --- necessary only for bi-dir.
			s1.setMyCourse(c1);
			l1.add(s1);
			hs.save(s1);
			System.out.println(" after l1= "+l1+" course "+c1.getName());
			tx.commit();
		} catch (HibernateException e) {

			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();
		}
	}

	public Student deleteStudent(String sName) throws Exception {
		// remove student by name from student tbl
		Session hs = HibernateUtils.getFactory().openSession();
		Transaction tx = hs.beginTransaction();
		Student s = null;
		try {
			// get stud with matching name
			String hql = "from Student s where s.name=:name";
			s = (Student) hs.createQuery(hql).setParameter("name", sName)
					.uniqueResult();
			// default = lazy fetching , so have to explicitely access Course
			// POJO
			Course c1 = s.getMyCourse();
			// System.out.println(s);
			hs.delete(s);
			tx.commit();
			return s;

		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();

		}

		// System.out.println(s);

	}

}
