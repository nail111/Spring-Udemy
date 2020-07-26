package Step5_PropertiesInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step5\\ApplicationContext.xml");
        FootballCoach footballCoach = context.getBean("myFootball",FootballCoach.class);
        System.out.println(footballCoach.getEmail());
        System.out.println(footballCoach.getTeam());
        context.close();
    }
}