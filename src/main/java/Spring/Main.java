package Spring;

import Spring.Config.AppConfig;
import Spring.Pojo.Driver.Driver;
import Spring.Pojo.Transport.Bus;
import Spring.Pojo.Transport.Car;
import Spring.Pojo.Transport.Pickup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("car", Car.class));
        System.out.println(context.getBean("bus", Bus.class));
        System.out.println(context.getBean("truck", Pickup.class));

        System.out.println(context.getBean("driver1", Driver.class));
        System.out.println(context.getBean("driver2", Driver.class));
        System.out.println(context.getBean("driver3", Driver.class));
    }
}
