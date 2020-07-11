import org.w3c.dom.ls.LSOutput;

public class assignment {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
            for (int j = 0; j <i-2 ; j++) {
                System.out.print("0 ");

            }
            if(i!=1){
                System.out.println(i+" ");
            }
            System.out.println();

        }System.out.println();
    }

}
