package homework_1;

import java.util.Scanner;

public class Homework1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input_name;
        System.out.println("Введите имя:");
        input_name = in.nextLine();
        task4(input_name);
    }

    static void task4(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
