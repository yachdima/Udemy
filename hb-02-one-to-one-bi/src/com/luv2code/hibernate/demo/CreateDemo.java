package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
						.configure()
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(InstructorDetail.class)
						.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create the object
//			Instructor tempInstructor = new Instructor("Chad", "Derby", "defdfd@mail.com");
//			
//			InstructorDetail tempInstructorDetail = new InstructorDetail("www.yuotube/dfsdfs","dfsfsdfsdf");
			
			Instructor tempInstructor = new Instructor("Mary", "Vase", "vase@mail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.yuotube/wwwww","Swimming");
			
			// associate the object
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
