package Spring.Config;

import Spring.Pojo.Driver.Driver;
import Spring.Pojo.Transport.Car;
import Spring.Pojo.Transport.Bus;
import Spring.Pojo.Transport.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean() {
        return new Car("AUDI", "Q7", 3.0);
    }

    @Bean
    public Bus getBusBean() {
        return new Bus("Huyndai", "County", 3.9);
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Toyota", "Tundra", 5.7);
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Din", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Charles", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Sam", getPickupBean());
    }
}
