package homework_1;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input_number;
        System.out.println("Введите целое число:");
        input_number = in.nextInt();
        System.out.println(task3(input_number));
    }

    static boolean task3(int number) {
        if (number < 0)
            return true;
        else
            return false;
    }
}
