//package Lec3;
//
//public class searching {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        int element=5;
//
//    }
//    public static int linear(int arr[],int element){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==element){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static int binary(int arr[],int element){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==element){
//                return mid;
//            }
//            if (arr[mid]<element) {
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//
//    }
//
//}
