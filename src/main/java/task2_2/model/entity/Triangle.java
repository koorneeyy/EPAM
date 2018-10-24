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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.base, base) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
