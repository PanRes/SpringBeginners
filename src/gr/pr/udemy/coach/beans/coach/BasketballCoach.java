package gr.pr.udemy.coach.beans.coach;

import gr.pr.udemy.coach.interfaces.Coach;

public class BasketballCoach implements Coach {

	public String getDailyWorkout() {
		return "Shoot 30 3-pointers";
	}

	public String getDailyFortune() {
		return null;
	}
}
