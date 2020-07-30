package Step11_AnnotationsFieldInjection;


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
    private FortuneService fortuneService;

    public String getFortune() {
       return fortuneService.getFortune();
    }
}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step11\\ApplicationContext.xml");
        Football football = context.getBean("myGame",Football.class);
        System.out.println(football.getFortune());
        context.close();
    }
}