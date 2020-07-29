package Step8_AnnotationsBeginning;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



@Component("myCoach")
class FootballCoach {
    public String getDailyWorkout() {
        return "Football";
    }
}


public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step8\\ApplicationContext.xml");
        FootballCoach footballCoach = context.getBean("myCoach",FootballCoach.class);
        System.out.println(footballCoach.getDailyWorkout());
        context.close();
    }
}