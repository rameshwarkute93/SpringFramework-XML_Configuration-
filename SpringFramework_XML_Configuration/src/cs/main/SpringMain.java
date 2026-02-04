package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cs.model.Student;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "cs/config/app.xml";
		
//		 With Spring
		
		ApplicationContext a = new ClassPathXmlApplicationContext(path);
		Student s = (Student) a.getBean("s1"); // Get Student Bean
		s.display();

// Spring is responsible for:
//		✔ Creating object
//		✔ Injecting values
//		✔ Managing lifecycle
//		✔ Reusing singleton objects
		
		// Without Spring
//		Student s = new Student();
//		s.setId(1);
//		s.setName("Ram");
//		s.setCity("Pimplaner");
//		s.display();
		
//You are responsible for:

//Creating object
//Setting values
//Managing lifecycle
	

	}

}
