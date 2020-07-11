public class DtoAny {
    public static void main(String[] args) {


     System.out.println(DeciToAny(11,10));
}
    public static int DeciToAny(int d,int base){
        int bin=0;
        int place=1;
        while(d>0){
            int r=d%base;
            d=d/base;
            bin=bin+r*place;
            place=place*base;
        }
        return bin;
    }
}
