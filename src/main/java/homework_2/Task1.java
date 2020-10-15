package homework_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите нечетное число:");
        number = in.nextInt();
        triangle(number);
    }

    static void triangle(int num) {
        String s = "*";
        StringBuilder b = new StringBuilder("\b\b");
        for (int i = 0; i < num / 2 + 1; i++) {
            System.out.println(s);
            s += "*";
        }


        for (int i = num / 2; i > 0; i--) {
            System.out.println(s + b);
            b.append("\b");
        }


    }
}

