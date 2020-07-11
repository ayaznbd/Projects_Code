package JavaOnlineString;

import java.util.Scanner;

public class StringPrintsChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();

        PrintsChar(s1);
    }
    public static void PrintsChar(String s){
        for (int i = 0; i <s.length(); i++) {
            System.out.println(s.charAt(i));

        }
    }
}
