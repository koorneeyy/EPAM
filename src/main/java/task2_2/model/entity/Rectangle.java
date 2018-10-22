package task2_2.model.entity;


public class Rectangle extends Shape {

    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide,String color) {
        super(color);
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double calcArea() {
       return this.aSide*this.bSide;
    }

    @Override
    public void draw() {
    //    System.out.println(" int this section we can drow Rectanle, \n but we invoke toString method");
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "aSide=" + aSide +
                ", shapeColor='" + shapeColor + '\'' +
                ", bSide=" + bSide +
                '}';
    }
}
