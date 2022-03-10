package hw1equation;

import static java.lang.Double.NaN;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
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
    public double getDiscriminant() {
        return getB()*getB() - 4*getA()*getC();
    }
    public double root1() {
        if (getDiscriminant() >= 0) {
            return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
        } else return NaN;
    }

    public double root2() {
        if (getDiscriminant() >= 0) {
            return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
        } else return NaN;
    }

    public void printRoots() {
        if (getDiscriminant() < 0) {
            System.out.println("Действительных корней нет");
        } else
        System.out.println("Корни квадратного уравнения " + root1() + ", " + root2());
    }
}
