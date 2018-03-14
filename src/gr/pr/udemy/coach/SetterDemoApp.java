package gr.pr.udemy.coach;

import gr.pr.udemy.coach.beans.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = applicationContext.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		applicationContext.close();
	}
}