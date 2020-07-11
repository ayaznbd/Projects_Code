package JavaOnlineString;

import java.util.Scanner;

public class SubStringQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        SubString(s1);

    }
    public static void SubString(String s1){
        for (int si = 0; si <s1.length() ; si++) {
            for (int ei = si+1; ei <=s1.length() ; ei++) {
                System.out.println(s1.substring(si,ei));

            }

        }

    }
}
