package task1_2.model;

public class MagicNumberModel {
    private int valueToFind;

    public int getValueToFind() {
        return valueToFind;
    }

    public void setValueToFind(int valueToFind) {
        this.valueToFind = valueToFind;
    }

    public String findMagicNumber(){
        String result="";
       int number=valueToFind;
        for (int k = number; k > 0; k--) {
            int sumDiv = 0;
            for (int i = k - 1; i > 0; i--) {
                if (k % i == 0) {
                    sumDiv += i;
                }
            }
            if (k == sumDiv) {
                result+=k+"; ";
            }
        }
        return result;
    }
}
