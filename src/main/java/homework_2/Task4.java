package homework_2;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9, 2, 10};
        reverse(numbers);
    }

    public static void reverse(int[] input) {
        System.out.println("Данный массив : " + Arrays.toString(input));
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("Перевернутый массив : " + Arrays.toString(input));
    }
}
