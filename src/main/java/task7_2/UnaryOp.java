package task7_2;


public class UnaryOp {
    private double value;


    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void unsigned() {
        value = -value;
    }

    public UnaryOp() {
        this(100.0);
    }

    public UnaryOp(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
