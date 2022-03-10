package hw2shapes;

public class Cuboid extends Form3D {

    private double a;
    private double b;
    private double c;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getVolume() {
        return (getA() * getB() * getC());
    }

    @Override
    public double getSurfaceArea() {
        return (2 * (getA() * getA() + getB() * getB() + getC() * getC()));
    }
}
