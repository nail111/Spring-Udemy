package Step15_AnnotationsBeanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("TheGame")
class Tennis {

   @PostConstruct
    public void Init_Method() {
        System.out.println("Init Method");
    }
    public Tennis() {
        System.out.println("Constructor");
    }
    public void Method() {
        System.out.println("Simple Method");
    }
    @PreDestroy
    public void Destroy_Method() {
        System.out.println("Destroy Method");
    }
}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step15\\ApplicationContext.xml");
        Tennis tennis = context.getBean("TheGame",Tennis.class);
        tennis.Method();
        context.close();
    }
}