package Step3_SetterInjection;

public class Fortune implements FortuneService {
    @Override
    public String getFortuneService() {
        return "You are so lucky buddy";
    }
}