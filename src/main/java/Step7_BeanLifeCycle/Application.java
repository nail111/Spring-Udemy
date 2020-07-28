package Step7_BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step7\\ApplicationContext.xml");
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}