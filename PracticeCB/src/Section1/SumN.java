package Section1;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Sum=0;
        int counter=1;
        while(counter<=n){
            Sum=Sum+counter;
            counter++;
        }
        System.out.println("The sum of first :"+n+" Numbers is :"+Sum);
    }
}
