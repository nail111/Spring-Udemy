package Step2;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "You must win with 5-0 score";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}