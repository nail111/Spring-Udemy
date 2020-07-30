package Step9_AnnotationsConstructorInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class FortuneService {

    public String HappyFortuneService() {
        return "Today is your lucky day";
    }
}

@Component("myFortune")
class FootballCoach {

    private FortuneService fortuneService;

   @Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String HappyFortuneService() {
        return fortuneService.HappyFortuneService();
    }
}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step9\\ApplicationContext.xml");
        FootballCoach footballCoach = context.getBean("myFortune",FootballCoach.class);
        System.out.println(footballCoach.HappyFortuneService());
        context.close();
    }
}