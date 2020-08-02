package Step17_SpringBeansNoXML;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


class Coach {
    public String getLucky() {
        return "Lucky";
    }
}

class NewCoach {

    public NewCoach(Coach coach) {
        this.coach = coach;
    }

    @Autowired
    private Coach coach;

    public String getLucky() {
       return coach.getLucky();
    }
    public boolean Weekend() {
        return true;
    }
}

@Configuration
class Football {

    @Bean
    public Coach TheCoach() {
       return new Coach();
    }
    @Bean
    public NewCoach MyGame() {
        return new NewCoach(TheCoach());
    }

}


public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Football.class);
        NewCoach newCoach = context.getBean("MyGame",NewCoach.class);
        System.out.println(newCoach.getLucky());
        System.out.println(newCoach.Weekend());
        context.close();
    }
}