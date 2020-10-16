package homework_2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 0, 18, 64, 4, 3, 78, 1};
        System.out.println(Arrays.toString(arr));
        Mix(arr);
        System.out.println(Arrays.toString(arr));
        Mix(arr);
        System.out.println(Arrays.toString(arr));
        Mix(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Mix(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            int ix = random.nextInt(input.length - i);
            int temp = input[ix];
            input[ix] = input[i];
            input[i] = temp;
        }
    }
}
