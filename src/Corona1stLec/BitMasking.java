package Corona1stLec;

public class BitMasking {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,4};
        OddEven(5);
        System.out.println(Unique(arr));
        System.out.println(CountBits(5));

    }
    public static void OddEven(int n){
        if((n&1)==1){
            System.out.println("This is the Odd Numbers.");
        }
        else{
            System.out.println("This is the Even Number.");
        }
    }
    public static int Unique(int arr[]){
        int res=0;
        for (int i = 0; i <arr.length ; i++) {
            res=res^arr[i];
        }
        return res;
    }
    public static int CountBits(int n){
        int cn=0;
        while(n!=0){
            if((n&1)==1){
                cn=cn+1;
            }
            n=n>>1;
        }
return cn;
    }
}
