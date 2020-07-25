package Step4_LiteralInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step4\\ApplicationContext.xml");
        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
        context.close();
    }
}