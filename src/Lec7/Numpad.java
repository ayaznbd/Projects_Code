package Lec7;
public class Numpad {
    public static void main(String[] args) {

        Logic("","89");
    }
    public static void Logic(String Pro,String Unpro){
        if(Unpro.isEmpty()){
            System.out.println(Pro);
            return;
            
        }
       int digit=Unpro.charAt(0) - '0';
        Unpro=Unpro.substring(1);
        for (int i = 3*(digit-1); i <3*digit ; i++) {
            if(i==26){
                continue;
            }
            Logic(Pro+(char)(i+'a'),Unpro);

        }

    }
}
