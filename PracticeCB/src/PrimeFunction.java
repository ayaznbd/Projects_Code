public class PrimeFunction {
    public static void main(String args[]){
        for (int i = 0; i <=5 ; i++) {
            System.out.println("The number of "+i+" is Prime "+isPrime(i));

        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                return false;

            }
        }
        return true;

    }
}
