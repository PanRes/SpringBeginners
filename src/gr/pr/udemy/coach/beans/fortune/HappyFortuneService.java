package gr.pr.udemy.coach.beans.fortune;

import gr.pr.udemy.coach.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Τoday is your lucky day!";
	}
}
