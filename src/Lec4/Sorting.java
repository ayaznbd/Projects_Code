package Lec4;

import java.util.Arrays;

//Bubble Sorting
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
