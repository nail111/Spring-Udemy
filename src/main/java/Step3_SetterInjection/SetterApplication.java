package Step3_SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step3\\ApplicationContext.xml");
        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
        context.close();
    }
}