package Step13_AnnotationsInjectionPropertiesFiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Football {
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
    @Value("${email}")
    private String email;
    @Value("${team}")
   private String team;
}

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step13\\ApplicationContext.xml");
        Football football = context.getBean("football",Football.class);
        System.out.println(football.getEmail());
        System.out.println(football.getTeam());
        context.close();
    }
}