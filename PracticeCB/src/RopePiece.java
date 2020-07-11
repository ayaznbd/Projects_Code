public class RopePiece {
    public static void main(String args[]){
       Rope(23,11,9,12);
    }
    public static void Rope(int n,int a, int b, int c){
        if(a%2==0 && b%2==0 && c%2==0){
            System.out.println("Not Possible");
            return;
        }
        if(n<=a && n<=b && n<=c){
            System.out.println("Not Possible");
            return;
        }
        int x= (int) Math.floor(n/(Math.min(Math.min(a,b),c)));
        System.out.println(x);
        return ;

    }
}
