package Feb29;

public class Permutation {
    public static void main(String args[]){
        Permutations("","ABC");

    }
    public static void Permutations(String Pro,String Unpro){
        if(Unpro.isEmpty()){

            System.out.println(Pro);

            return;
        }
        char ch= Unpro.charAt(0);
        Unpro=Unpro.substring(1);
        for (int i = 0; i <=Pro.length() ; i++) {
            String First=Pro.substring(0,i);
            String Second=Pro.substring(i);
            Permutations(First+ch+Second,Unpro);
        }
    }

}
