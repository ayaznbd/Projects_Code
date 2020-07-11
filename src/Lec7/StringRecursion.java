package Lec7;

public class StringRecursion {
    //static  int count =0;
    public static void main(String[] args) {
      // SubSeq("","abc");
      // hihihi("","hihihi");
       Dice("",6);
       //System.out.println(count);
    }
    public static void SubSeq(String Procs,String Unpro){
        if(Unpro.isEmpty()){
            System.out.println(Procs);

            return;
        }
        char ch=Unpro.charAt(0);
        Unpro=Unpro.substring(1);
        SubSeq(Procs+ch,Unpro);
        SubSeq(Procs,Unpro);

    }
    public static void hihihi(String Pro,String Unpro){
        if(Unpro.isEmpty()){
            System.out.println(Pro);
            return;
        }
        char ch=Unpro.charAt(0);
        Unpro=Unpro.substring(1);
        if(ch=='h'){
            hihihi(Pro+ch,Unpro);
        }
        else{
            hihihi(Pro,Unpro);
    }
    }
    public static void Dice(String Pro,int target){
        if(target==0){
            //count++;
            System.out.println(Pro);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            Dice(Pro+i,target-i);


        }


    }


}
