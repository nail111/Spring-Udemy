package Step1_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step1\\ApplicationContext.xml");
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(coach.getDailyWorkOut());
        context.close();
    }
}