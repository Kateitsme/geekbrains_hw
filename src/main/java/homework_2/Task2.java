package homework_2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] arr= {5,9,0,18,64,4,3,78,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr){
        int min,min_index,tmp;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }
            if (i != min_index) {
                tmp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = tmp;
            }
        }
    }
}
