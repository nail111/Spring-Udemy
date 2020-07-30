package Step10_AnnotationsSetterInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class FortuneService {
    public String getFortune() {
        return "Fortune";
    }
}
@Component("myGame")
class Football {

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter");
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;


    public String getFortune() {
       return fortuneService.getFortune();
    }
}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step10\\ApplicationContext.xml");
        Football football = context.getBean("myGame",Football.class);
        System.out.println(football.getFortune());
        context.close();
    }
}