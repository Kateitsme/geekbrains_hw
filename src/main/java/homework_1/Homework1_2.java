package homework_1;

import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input_number;
        System.out.println("Введите целое число:");
        input_number = in.nextInt();
        System.out.println(task2(input_number));
    }

    static char task2(int number) {
        if (number >= 0) {
            System.out.println("Число положительное.");
        } else
            System.out.println("Число отрицательное.");

        return 0;
    }
}
