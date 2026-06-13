package in.main.service;

import in.main.config.Configurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Configurations.class);
        orderservice or= (orderservice) con.getBean(orderservice.class);
        or.palceOrder();
    }
}
