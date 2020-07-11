import java.sql.SQLOutput;

public class ArmstrongNumber {
    public static void main(String args[]) {
            System.out.println("This 153 is an armstrong number: " + Armstrong(153));

    }
    public static boolean Armstrong(int n){
        int c=0;
        int temp=n;
        while(n>0){
            int a=n%10;
            c=c+(a*a*a);
            n=n/10;
        }
        if(temp==c){
            return true;
        }else{
            return false;
        }
            

    }
}
