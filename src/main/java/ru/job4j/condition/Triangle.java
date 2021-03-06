package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double period = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(period * (period - ab) * (period - ac) * (period - bc));
        }
        return rsl;
    }

}
