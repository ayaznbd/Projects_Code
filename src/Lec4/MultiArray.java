package Lec4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        int ar[][]=new int[3][3];
        int ar1[][]={{1,2,3},{4,5,6},{7,8,9}};
        Scanner s=new Scanner(System.in);
        /*for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                System.out.println(ar1[i][j]);

            }
        }*/
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                ar[i][j]=s.nextInt();
                System.out.println(ar[i][j]);
            }

        }
    }
}
