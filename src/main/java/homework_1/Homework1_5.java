package homework_1;

import java.util.Scanner;

public class Homework1_5 {
    public static void main(String[] args) {
        task5();
    }

    static void task5() {
        Scanner in = new Scanner(System.in);
        byte arr[] = new byte[9];
        System.out.println("Введите массив, состоящий из 0 и 1 размером " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextByte();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
