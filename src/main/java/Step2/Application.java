package Step2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step2_XML\\ApplicationContext.xml");

       Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkOut());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}