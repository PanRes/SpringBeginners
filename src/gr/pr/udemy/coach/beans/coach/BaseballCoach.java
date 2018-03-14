package gr.pr.udemy.coach.beans.coach;

import gr.pr.udemy.coach.interfaces.Coach;
import gr.pr.udemy.coach.interfaces.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "Spend 30 minute on batting practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
