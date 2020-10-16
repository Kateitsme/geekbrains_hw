package homework_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Введите целое число:");
        number = in.nextInt();
        TaskDate(number);

    }

    static void TaskDate(int num) {
        int M, S, H;
        S = num % 60;
        M = num / 60;
        H = M / 60;
        M = M % 60;
        System.out.printf("%02d", H);
        System.out.print(":");
        System.out.printf("%02d", M);
        System.out.print(":");
        System.out.printf("%02d", S);
    }
}
