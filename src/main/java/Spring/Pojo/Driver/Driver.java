package Spring.Pojo.Driver;

import Spring.Pojo.Transport.Transport;
import org.springframework.beans.factory.annotation.Autowired;


public class Driver {

    private String name;
    Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
