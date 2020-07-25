package Step3_SetterInjection;

public class CricketCoach implements Coach{
    public void setFortune(Fortune fortune) {
        System.out.println("Cricked inside setter method");
        this.fortune = fortune;
    }
    private Fortune fortune;
public CricketCoach() {
    System.out.println("Cricked inside no-arg constructor");
}
    @Override
    public String getDailyWorkout() {
        return "Workout of Cricket";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortuneService();
    }
}