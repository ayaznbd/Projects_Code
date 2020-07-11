package Lec6;

public class ArrayUsingRecursion {
    public static void main(String[] args) {

    }
    public static int search(int arr[],int x,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return search(arr,x,i-1);
    }
    public static void palindrome(int arr[],int i){


    }


}
