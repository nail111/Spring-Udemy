package Step12_AnnotationsQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


abstract class Fortune3 {
    abstract String getFortune();
}

@Component
class Fortune extends Fortune3{
   public String getFortune() {
       return "Fortune";
   }
}

@Component
class Fortune2 extends Fortune3{
    public String getFortune() {
        return "Fortune2";
    }
}

@Component
class Football {
    @Autowired
    @Qualifier("fortune2")
    private Fortune3 fortune3;

    public String getFortune1() {
       return fortune3.getFortune();
    }

}


public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step12\\ApplicationContext.xml");
        Football obj = context.getBean("football",Football.class);
        System.out.println(obj.getFortune1());
        context.close();
    }
}