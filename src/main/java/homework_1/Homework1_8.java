package homework_1;

public class Homework1_8 {
    public static void main(String[] args) {
        task8();
    }

    static void task8() {
        int[][] arr = new int[6][6];
        System.out.println(arr.length);
        for (int i = 0; i < 6; i++) {
            arr[i][i] = 1;
            System.out.print(arr[i][i] + " ");
        }
    }
}
