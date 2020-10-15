package homework_2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 0, 18, 64, 4, 3, 78, 1};
        System.out.println(Arrays.toString(arr));
        Mix(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Mix(int[] input) {
        Random random = new Random();
        int i = random.nextInt(input.length + 1);
        System.out.println(i);
        for (int j = 0; j < input.length; j++) {
            int temp;
            if (0 < j && j < i) {
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
    }
}
