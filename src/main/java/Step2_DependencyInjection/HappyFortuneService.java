package Step2_DependencyInjection;

public class HappyFortuneService implements FortuneService{
    public String getFortune() {
        return "Today is your lucky day";
    }
}