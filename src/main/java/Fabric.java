import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Fabric {
    private String message;
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    /*public void createCar(Car car){
        this.car.create();
    }*/


    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Fabric fabric = (Fabric) context.getBean("fabrictest");
    }
}
