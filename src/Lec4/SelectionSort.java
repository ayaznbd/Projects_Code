package Lec4;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int []arr={6,5,4,3,2,1};
        for (int i = 0; i <arr.length ; i++) {
            int max=maxIndex(arr,0,arr.length-i-1);
            swap(arr,max,arr.length-i-1);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int maxIndex(int arr[],int start,int end){
        int maxindex=0;
        for (int i = start+1; i<=end ; i++) {
            if(arr[i]>arr[maxindex]){
                maxindex=i;
            }
        }
        return maxindex;
    }
    public static void swap(int[] arr,int max,int a){
        int t=arr[max];
        arr[max]=arr[a];
        arr[a]=t;
    }
}
