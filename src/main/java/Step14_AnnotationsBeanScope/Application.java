package Step14_AnnotationsBeanScope;


import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("game")
@Scope("singleton")
class Tennis {}

@Component("TheGame")
@Scope("prototype")
class Football {}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step14\\ApplicationContext.xml");
        Tennis tennis1 = context.getBean("game",Tennis.class);
        Tennis tennis2 = context.getBean("game",Tennis.class);
        System.out.println("Singleton: ");
        System.out.println(tennis1);
        System.out.println(tennis2);

        System.out.println();

        System.out.println("Prototype: ");
        Football football1 = context.getBean("TheGame",Football.class);
        Football football2 = context.getBean("TheGame",Football.class);
        System.out.println(football1);
        System.out.println(football2);
        context.close();
    }
}