public class Wheel {
    private int inch;
    private String alloy;

    public Wheel(int inch, String alloy) {
        this.inch = inch;
        this.alloy = alloy;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "inch=" + inch +
                ", alloy='" + alloy + '\'' +
                '}';
    }
}
