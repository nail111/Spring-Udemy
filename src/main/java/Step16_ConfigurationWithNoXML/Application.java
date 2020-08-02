package Step16_ConfigurationWithNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Coach {
    public String text() {
        return "Some text";
    }
}


@Configuration
@ComponentScan("Step16_ConfigurationWithNoXML")
@Component("myGame")
class Baseball {
    @Autowired
    private Coach coach;

    public String text() {
      return coach.text();
    }
}



public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Baseball.class);
        Baseball baseball = context.getBean("myGame",Baseball.class);
        System.out.println(baseball.text());
        context.close();
    }
}