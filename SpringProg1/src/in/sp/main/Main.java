package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		String config_loc = "classpath:/in/sp/resources/applicationContext.xml";

		ApplicationContext context =new ClassPathXmlApplicationContext(config_loc);
		
		Student std=(Student)context.getBean("stdId");
		std.display();
		
		
	}

}

//1.spring-beans-xxx.jar
//2.spring-core-xxx.jar
//3spring-context-xxx.jar
//4.common-logging.xxx.jar
//5.spring-expression-xxx.jar
