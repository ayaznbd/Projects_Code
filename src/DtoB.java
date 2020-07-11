public class DtoB {
    public static void main(String[] args) {
        System.out.println(DeciToBin(11));
    }
    public static int DeciToBin(int d){
        int bin=0;
        int place=1;
        while(d>0){
            int r=d%2;
            d=d/2;
            bin=bin+r*place;
            place=place*10;
        }
        return bin;
    }
}
