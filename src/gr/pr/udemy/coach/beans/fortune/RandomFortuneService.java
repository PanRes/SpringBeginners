package gr.pr.udemy.coach.beans.fortune;

import gr.pr.udemy.coach.interfaces.FortuneService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	List<String> fortunes = Arrays.asList("You will have good day", "Yoy will have mediocre day","You will have a bad day");
	
	public String getFortune() {
		Random rand = new Random();
		return fortunes.get(rand.nextInt(3));
	}
}
