package task2_2.model.entity;

public class Circle extends Shape {
    double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
    //    System.out.println(" int this section we can drow Circle, \n but we invoke toString method");
        System.out.println(this);
    }

    @Override
    public double calcArea() {
        return  Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius ;
    }
}
