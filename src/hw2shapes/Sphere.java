package hw2shapes;

public class Sphere extends Form3D {

    private double radius;

        public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * getRadius() * getRadius() * getRadius();
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * getRadius() * getRadius();
    }
}
