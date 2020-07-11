package OnlineCourse;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        if(n%2==0){
            System.out.println("Even number"+n);
        }
        else{
            System.out.println("Odd Number"+n);
        }
    }
}
