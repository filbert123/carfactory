import java.util.List;

class Car {
    private String id;
    private String modelname;
    private Color color;
    private Engine engine;
    private BodyType bodyType;
    private List<Wheel> wheels;

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void create(){

    }
}
