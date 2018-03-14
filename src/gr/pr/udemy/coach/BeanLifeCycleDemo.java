package gr.pr.udemy.coach;

import gr.pr.udemy.coach.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}
}