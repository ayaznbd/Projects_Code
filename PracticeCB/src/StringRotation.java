public class StringRotation {
    public static void main(String args[]){
        String st1="abcde",st2="edcab";
        if(st1.length()!=st2.length()){
            System.out.println("Not Rotation");
        }
        else{
            st1=st1.concat(st2);
            if(st1.indexOf(st2)!=-1){
                System.out.println("Second String is the rotation of first string.");
            }
            else{
                System.out.println("Second string is not the rotation of first string.");
            }

        }
    }
}
