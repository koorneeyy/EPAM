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
    public String toString() {
        return super.toString() +
                ", radius=" + radius ;
    }
}
