public class GCD {
 public static void main(String args[]){

     System.out.println(Gcd(60,36));
 }
 public static int Gcd(int divident, int divisor){
     while(divident%divisor!=0){
         int rem=divident%divisor;
         divident=divisor;
         divisor=rem;
     }
     return divisor;
 }
}
