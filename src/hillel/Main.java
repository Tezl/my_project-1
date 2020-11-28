package hillel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int number0fE       (примерно 15:15)

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i;
            if (numbers[i] % 2 == 0) {
                System.out.println("чётное - " + numbers[i]);
            } else {
                if (numbers[i] % 2 == 1) {
                    System.out.println("не чётное - " + numbers[i]);

                }
            }

        }
    }
}
