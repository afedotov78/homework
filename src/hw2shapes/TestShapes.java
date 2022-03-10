package hw2shapes;

public class TestShapes {
    public static void main(String[] args) {

        Sphere one  = new Sphere(7);
        Cuboid two = new Cuboid(2, 3, 4);

        System.out.println(one.getVolume());
        System.out.println(one.getSurfaceArea());
        System.out.println(two.getVolume());
        System.out.println(two.getSurfaceArea());

    }
}
