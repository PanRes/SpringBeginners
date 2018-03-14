package gr.pr.udemy.coach.beans.coach;

import gr.pr.udemy.coach.interfaces.Coach;
import gr.pr.udemy.coach.interfaces.FortuneService;

public class TrackCoach implements Coach {

    public FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return "Just Do it: " + fortuneService.getFortune();
    }
    
    public void initMethod() {
        System.out.println("bean initiated");
    }
    
    public void destoryMethod() {
        System.out.println("bean destroyed");
    }
}
