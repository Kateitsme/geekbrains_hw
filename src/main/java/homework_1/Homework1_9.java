package homework_1;

import java.util.Scanner;

public class Homework1_9 {
    public static void main(String[] args) {
        task9();
    }

    static void task9() {
        Scanner in = new Scanner(System.in);
        byte arr[] = new byte[5];
        byte min, max;
        System.out.println("Введите массив, состоящий из целых чисел размером " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextByte();
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
        System.out.println("Минимальное число в массиве = " + min);
    }
}
