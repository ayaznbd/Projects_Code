package Lec5;

public class Upp2Lower {
    public static void main(String[] args) {
        System.out.println(Strl("hElLo"));
     //   System.out.println(frequency("bala"));
    }

    public static String Strl(String str) {


        StringBuilder builder=new StringBuilder(str);
        for (int i = 0; i <str.length() ; i++) {
            char  ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)('a'+(ch-'A'));
            }
            else{
                ch=(char)('A'+(ch-'a'));
            }
            builder.setCharAt(i,ch);
        }
        return builder.toString();
    }

    /*ublic static int[] frequency(String str) {
        int [] freq=new int [26];
        StringBuilder builder=new StringBuilder(str);
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            freq[ch-'a']++;

        }
    //    return freq[];

    }*/
}
