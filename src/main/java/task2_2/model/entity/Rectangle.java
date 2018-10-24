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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.aSide, aSide) != 0) return false;
        return Double.compare(rectangle.bSide, bSide) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(aSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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
