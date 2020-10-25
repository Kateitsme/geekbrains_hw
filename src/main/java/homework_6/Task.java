package homework_6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        String[][] array = {{"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] error_size = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4"}};
        String[][] error_data = {{"1", "1", "3", "4",}, {"1", "2", "аа3", "4"}, {"1", "1", "3", "4",}, {"1", "2", "3", "4"}};
        System.out.println("Проверка корректного массива");
        test(array);
        System.out.println("Проверка массива некорректного размера");
        test(error_size);
        System.out.println("Проверка массива с некорректными данными");
        test(error_data);
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int value = 0;
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
            throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            for (int c = 0; c < array.length; c++) {
                try {
                    value = Integer.parseInt(array[i][c]);
                    sum += value;
                } catch (IllegalArgumentException e) {
                    String message = "в " + String.valueOf(i + 1) + " ряду, " + String.valueOf(c + 1) + " ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;
    }

    public static void test(String[][] array) {
        int result = 0;
        try {
            result = 0;
            result = analyze(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равен " + String.valueOf(result));
        }
    }
}
