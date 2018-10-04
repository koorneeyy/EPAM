package task1_1.model;

public class NumberModel {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String convertToBinary() {
        String result = "";
        int localVal = getValue();
        while (localVal > 0) {
            result = ((localVal % 2) == 0 ? "0" : "1") + result;
            localVal = localVal / 2;
        }
        return result;
    }

    public String convertToOcta() {
        String result = "";
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7'};
        int localVal = getValue();
        while (localVal > 0) {
            int tempIndex = localVal % 8;
            result = digits[tempIndex] + result;
            localVal = localVal / 8;
        }
        return "0" + result;
    }

    public String convertToHex() {
        String result = "";
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int localVal = getValue();
        while (localVal > 0) {
            int tempIndex = localVal % 16;
            result = digits[tempIndex] + result;
            localVal = localVal / 16;
        }
        return "0x" + result;
    }

}