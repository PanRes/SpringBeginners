package gr.pr.udemy.coach;

import gr.pr.udemy.coach.beans.coach.TrackCoach;
import gr.pr.udemy.coach.interfaces.Coach;

public class MyApp {

    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}