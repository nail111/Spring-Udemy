package Step8_AnnotationsBeginning.DefaultComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



@Component
class Default_Component {
    public String getSomeString() {
        return "Some text";
    }
}



public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("Step8\\ApplicationContext.xml");
        // Write name of class: Default_Component but first letter must be lowercase: default_Component
        Default_Component default_component = context2.getBean("default_Component",Default_Component.class);
        System.out.println(default_component.getSomeString());
        context2.close();
    }
}