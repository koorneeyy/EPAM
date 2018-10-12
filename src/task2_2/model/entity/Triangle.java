package task2_2.model.entity;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height,String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
   //     System.out.println(" int this section we can drow Triangle, \n but we invoke toString method");
        System.out.println(this);
    }

    @Override
    public double calcArea() {
        return  (this.base* this.height)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", shapeColor='" + shapeColor + '\'' +
                ", height=" + height +
                '}';
    }
}
