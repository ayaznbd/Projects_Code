package JavaOnlineString;

public class StringBrushUp {
    public static void main(String[] args) {
        //part 1-->
        String str="Hello ";
        // str="Bye Guy's";             // Updating str
        System.out.println(str);
        //part 2-->
        System.out.println("**************************");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(5));//print white space
        System.out.println(str.charAt(2));//print '
        System.out.println(str.charAt(str.length()-1));// last element accessing
        System.out.println(str.length());
        // part 3
        System.out.println("**************************");
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        //part 4
        System.out.println("**************************");
        String s1="hiii";
        String s2="byeee";
        String s3=s1+s2;
        System.out.println(s3);
        System.out.println(s2.concat(s1));
        System.out.println("**************************");
        //part 5
        System.out.println(str.indexOf("ell"));
        System.out.println(str.indexOf("El"));
        System.out.println("**************************");
        // part 6
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("He"));
        System.out.println("**************************");
        // part 7
        String S1="hello";
         String S2=S1;
         String S3="hello";
         String S4=new String("hello");
        System.out.println((S1==S2)+","+S1.equals(S2));
        System.out.println((S1==S3)+","+S1.equals(S3));
        System.out.println((S1==S4)+","+S1.equals(S4));

    }
}
