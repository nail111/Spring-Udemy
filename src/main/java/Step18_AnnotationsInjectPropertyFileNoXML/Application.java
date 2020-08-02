package Step18_AnnotationsInjectPropertyFileNoXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

class Coach {
    public String getEmail() {
        return email;
    }

    public String getName() {
        return Name;
    }
     @Value("${email}")
    private String email;
    @Value("${Name}")
    private String Name;
}

@Configuration
@PropertySource("Step18\\My.properties")
class Football {
 @Bean
    public Coach MyGame() {
     return new Coach();
 }
}

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Football.class);
        Coach coach = context.getBean("MyGame",Coach.class);
        System.out.println(coach.getEmail());
        System.out.println(coach.getName());
        context.close();
    }
}