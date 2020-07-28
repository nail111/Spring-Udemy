package Step7_BeanLifeCycle;

public class FootBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "FootballCoach's Workout";
    }
    public void InitMethod() {
        System.out.println("This is InitMethod");
    }
    public void DestroyMethod() {
        System.out.println("This is DestroyMethod");
    }
}