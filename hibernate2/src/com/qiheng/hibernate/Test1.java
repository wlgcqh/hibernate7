package com.qiheng.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Test1 {
	public static SessionFactory sessionFactory;

	static {
		try {
			Configuration cfg = new Configuration().configure();
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).buildServiceRegistry();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
//		Session session = sessionFactory.openSession();
//		Transaction tx = null;
//		
//		Student student = new Student();
//		student.setStudent_name("qiheng");
//		student.setTimestamp(new Timestamp(new Date().getTime()));
//		student.setCourses(new HashSet<Course>());
//		
//		Course course1 = new Course();
//		course1.setCourse_name("math");
//		course1.setCredit(4);
//		course1.setStudent(student);
//		
//		Course course2 = new Course();
//		course2.setCourse_name("english");
//		course2.setCredit(2);
//		course2.setStudent(student);
//		
//		Course course3 = new Course();
//		course3.setCourse_name("music");
//		course3.setCredit(3);
//		course3.setStudent(student);
//		
//		student.getCourses().add(course1);
//		student.getCourses().add(course2);
//		student.getCourses().add(course3);
//		
//		
//		try{
//			tx = session.beginTransaction();
//			session.save(student);
//			
//			
//			
//			tx.commit();
//		}catch (Exception e) {
//			e.printStackTrace();
//			if(tx!=null){
//				tx.rollback();
//			}
//		
//		
//		}finally{
//			session.close();
//		}
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		Course course = null;
		Student student = null;
		
		
		try{
			tx = session.beginTransaction();
			
//			Query query = session.createQuery("from Student");
//			
//			List list = query.list();
//			System.out.println(list);
			
			student = (Student) session.get(Student.class, "402880e54a674611014a674612d00000");
			
//			System.out.println(student.getStudent_name());
//			System.out.println(student.getCourses().iterator().next().getCourse_name());
			
			
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		
		
		}finally{
			session.close();
		}
//		System.out.println(student);
		System.out.println(student);
	}
}

