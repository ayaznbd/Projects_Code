public class fib {
    public static void main(String[] args) {
        int n=5,f=0,s=1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(f+" ");
                int t=f+s;
                f=s;
                s=t;


            }
            System.out.println();

        }
        System.out.println();
    }

}
