package Step6_BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Step6\\BeanScopeApplicationContext.xml");
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        boolean result = (theCoach == alphaCoach);
        System.out.println("theCoach in memory: "+theCoach);
        System.out.println("alphaCoach in memory: "+alphaCoach);
        System.out.println("Same memory? :" + result);
        context.close();
    }
}