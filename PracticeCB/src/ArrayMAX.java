public class ArrayMAX{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arrayMax(arr));
    }
    public static int arrayMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
          return max;
    }
}
