package Lec4;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int [] arr={7,6,5,4,3};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int max,int a){
        int t=arr[max];
        arr[max]=arr[a];
        arr[a]=t;
    }
}
