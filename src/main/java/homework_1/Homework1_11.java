package homework_1;

import java.util.Scanner;

public class Homework1_11 {
    public static void main(String[] args) {
        System.out.println(task11());
    }

    static boolean task11() {
        Scanner in = new Scanner(System.in);
        byte arr[] = new byte[5];
        int sum_right = 0;
        int sum_left = 0;
        System.out.println("Введите массив, состоящий из целых чисел размером " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextByte();
            sum_right = sum_right + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (sum_left != sum_right) {
                sum_left += arr[i];
                sum_right -= arr[i];
            }
        }
        if (sum_left == sum_right) {
            return true;
        } else
            return false;
    }
}
