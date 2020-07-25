package Step2_DependencyInjection;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkOut() {
        return "You must win with 90 score";
    }
}