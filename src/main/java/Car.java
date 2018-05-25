import java.util.List;

class Car {
    private String id;
    private String modelname;
    private Color color;
    private Engine engine;
    private BodyType bodyType;
    private List<Wheel> wheels;

    public Car(String id, String modelname, Color color, Engine engine, BodyType bodyType, List<Wheel> wheels) {
        this.id = id;
        this.modelname = modelname;
        this.color = color;
        this.engine = engine;
        this.bodyType = bodyType;
        this.wheels = wheels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", modelname='" + modelname + '\'' +
                ", color=" + color +
                ", engine=" + engine +
                ", bodyType=" + bodyType +
                ", wheels=" + wheels +
                '}';
    }

    /*public void create(){

    }*/
}
