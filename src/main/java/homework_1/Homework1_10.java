package homework_1;

import java.util.Scanner;

public class Homework1_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input_year;
        System.out.println("Введите год:");
        input_year = in.nextInt();
        task10(input_year);

    }

    static void task10(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год невисокосный");
        }
    }
}
