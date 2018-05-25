import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.ArrayList;
import java.util.List;

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
        createCars("Jetta_S",99);

    }

    public static void createCars(String id,int amount){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        List<Car> cars = new ArrayList<Car>();
        for(int i=0;i<=amount;i++){
            Car car = (Car) context.getBean(id);
            cars.add(car);
        }
        System.out.println("Fabric created "+cars.size()+" models ");
    }
}
