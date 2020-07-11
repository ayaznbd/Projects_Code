package Lec5;

import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {
        //p1();
       // System.out.println(Decr(5));
       //Decr(5);
        System.out.println(factorial(5));
        System.out.println(fib(6));
    }
    /*public static void p1(){
        System.out.println("1");
        p2();
        System.out.println("C");
    }
    public static void p2(){
        System.out.println("2");
        p3();
        System.out.println("B");
    }
    public static void p3(){
        System.out.println("3");
        p4();
        System.out.println("A");
    }
    public static void p4(){
        System.out.println("4");
    }*/

   /* public static int Decr(int n) {
        if(n==0){
            return 0;
        }

        System.out.println(n);
        Decr(n-1);
        return 0;
    }*/
    public static int factorial(int n){
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);

        }
public static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);

}

    }

