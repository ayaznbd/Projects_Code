public class BtoD {
    public static void main(String[] args) {
        System.out.println(bin2deci(1010));
    }

    public static int bin2deci(int bin) {
        int deci=0;
        int place=1;
        while(bin>0){

            int r=bin%10;
            bin=bin/10;
            deci=deci+r*place;
           place=place*2;
        }
        return deci;

    }
}
