public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(Reverse(12345));
    }
    public static int Reverse(int n){
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
}
