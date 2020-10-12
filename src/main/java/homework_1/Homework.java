package homework_1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(task1());
    }

    static boolean task1() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[2];
        Boolean result;
        System.out.println("array length: " + arr.length);
        System.out.println("Введите 2 целых числа.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        in.close();
        System.out.println(sum);
        if ((sum >= 10) && (sum <= 20))
            return true;
        else
            return false;

    }

}
