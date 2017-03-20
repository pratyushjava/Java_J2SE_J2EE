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
			System.out.println("Course created with id " + hs.save(c1));
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();
		}
		System.out.println("course added  " + c1);
	}

	// add student to Course
	public void addStudent(String name, Student s1) throws Exception {
		System.out.println("in add stud dao");
		Session hs = HibernateUtils.getSession();
		Transaction tx = hs.beginTransaction();

		try {
			// get Course with matching name
			String hql = "from Course c where c.name=:name";
			// stmt below will raise Hib Exc --- if course names are dup.
			Course c1 = (Course) hs.createQuery(hql).setParameter("name", name)
					.uniqueResult();
			if (c1 != null) {
				// retrieving all student from selected course
				List<Student> l1 = c1.getStudents();
				// specify course for student --- necessary only for bi-dir.
				s1.setMyCourse(c1);
				l1.add(s1);
			}

			tx.commit();
		} catch (HibernateException e) {

			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();
		}
	}

	public Student deleteStudent(int sid) throws Exception {
		// remove student by id from student tbl
		Session hs = HibernateUtils.getFactory().openSession();
		Transaction tx = hs.beginTransaction();
		Student s = null;
		try {
			// get stud with specified id
			/*
			 * String hql = "from Student s where s.name=:name"; s = (Student)
			 * hs.createQuery(hql).setParameter("name", sName) .uniqueResult();
			 * // default = lazy fetching , so have to explicitely access Course
			 * // POJO if (s != null) { Course c1 = s.getMyCourse();
			 * 
			 * // System.out.println(s); hs.delete(s); }
			 */

			s = (Student) hs.get(Student.class, sid);
			if (s != null)
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

	// get students of Course
	public List<Student> getStudents(String name) throws Exception {
		System.out.println("in get stud dao");
		Session hs = HibernateUtils.getSession();
		Transaction tx = hs.beginTransaction();
		List<Student> l1 = null;
		Course c1 = null;
		try {
			// get Course with matching name
			String hql = "from Course c where c.name=:name";
			// stmt below will raise Hib Exc --- if course names are dup.
			c1 = (Course) hs.createQuery(hql).setParameter("name", name)
					.uniqueResult();
			if (c1 != null) {
				// retrieving all student from selected course --explicitely as
				// fetch=lazy
				l1 = c1.getStudents();
				System.out.println(l1.size());

				// System.out.println("stud list "+l1);
			}
			tx.commit();
		} catch (HibernateException e) {

			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();
		}
		// l1=c1.getStudents();
		System.out.println("stud list1 " + l1);
		return l1;
	}

	public List<Student> cancelCourse(String cName) throws Exception {
		// remove course by name
		Session hs = HibernateUtils.getFactory().openSession();
		Transaction tx = hs.beginTransaction();
		List<Student> s = null;
		Course c = null;
		try {

			String hql = "from Course c where c.name=:name";
			c = (Course) hs.createQuery(hql).setParameter("name", cName)
					.uniqueResult();
			// default = lazy fetching , so have to explicitely access students
			if (c != null) {
				s = c.getStudents();
				System.out.println("studs informed " + s);
				System.out.println(s.size());
				hs.delete(c);
			}

			tx.commit();

		} catch (HibernateException e) {
			tx.rollback();
			throw e;
		} finally {
			if (hs != null)
				hs.close();

		}
		System.out.println("studs informed1 " + s);
		return s;

		// System.out.println(s);

	}

}
