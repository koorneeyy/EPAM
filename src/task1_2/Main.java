package task1_2;


public class Main {


    private static void testMagicNumber(int number) {
        for (int k = number; k > 0; k--) {
            int sumDiv = 0;
            for (int i = k - 1; i > 0; i--) {
                if (k % i == 0) {
                    sumDiv += i;
                }
            }
            if (k == sumDiv) {
                System.out.println(k);
            }
        }

    }

}
