package Lec3;

public class maximum_value {
    public static void main(String[] args) {
        int arr[]={5,6,3,7,8,9};
    }
    public static int maxElement(int arr[]){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;

    }
    public static int maxIndex(int arr[]){
        int maxindex=0;
        for (int i = 1; i<arr.length ; i++) {
            if(arr[i]>arr[maxindex]){
                maxindex=i;
            }

        }
        return maxindex;
    }
}
