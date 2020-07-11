package Lec6;

import static java.lang.Boolean.FALSE;

public class RecursionFlow {

    public static void main(String[] args) {
        printdec(4);
        System.out.println(fact(5));
        System.out.println("Factorial of 6 is"+Factorial(6));
        System.out.println("Fibonnaci of 6th term is "+Fibo(6));
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr,3,0));
        System.out.println(isSort(arr,0));
        pattern(8,0);
        BubbleSort(arr,4,0);
    }
    public static void printdec(int n){
        if(n==0){
            return;
        }
        printdec(n-1);
        System.out.println(n);

    }
    public static int fact(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*fact(n-1);
    }

    public static int Factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);

    }
    public static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static int search(int arr[],int x,int i){
        if(i==0){
            return -1;

        }
        if(arr[i]==x){
            return i;
        }
        return search(arr,x,i+1);
    }
    public static boolean isSort(int arr[],int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSort(arr, i + 1);


    }
    public static void pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c==r){
            System.out.println();
            pattern(r-1,0);
            return;
        }
        System.out.print("*");
        pattern(r,c+1);
    }
    public static void BubbleSort(int arr[],int i,int j){
        if(i==0){
            return;
        }
        if(i==j) {
        BubbleSort(arr,i-1,0);
        return;
        }

        if (arr[j] > arr[j + 1])
        {
                int t = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = t;
        }
            BubbleSort(arr,i,j+1);
    }
/* Assignment for Selection Sort using recursion*/
}

