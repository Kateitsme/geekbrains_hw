package homework_1;

public class Homework1_6 {
    public static void main(String[] args) {
        task6();
    }

    static void task6() {
        byte first = 2;
        byte arr[] = new byte[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = first;
            first += 3;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
