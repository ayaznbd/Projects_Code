package Feb29;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        //Mazepath(3,3,"");
       // System.out.println(MazepathCount(3,3,""));
        System.out.println(MazepathList(3,3,""));
    }
    public static void Mazepath(int row,int col, String Pro){
        if(row==1 && col==1){
            System.out.println(Pro);
            return;
        }
        if(row>1){
            Mazepath(row-1,col,Pro+"V");
        }
        if(col>1){
            Mazepath(row,col-1,Pro+"H");
        }
    }
    public static int MazepathCount(int row,int col,String Pro) {
        if (row == 1 && col == 1) {
            System.out.println(Pro);
            return 1;
        }
        int c = 0;
        if (row > 1) {
            c += MazepathCount(row - 1, col,Pro+"V");
        }
        if (col > 1) {
            c += MazepathCount(row, col - 1,Pro+"H");
        }
        return c;
    }
    public static ArrayList MazepathList(int row, int col, String Pro) {
        if (row == 1 && col == 1) {
            ArrayList list=new ArrayList();
            list.add(Pro);
            return list;
        }
        ArrayList list=new ArrayList();
        if (row > 1) {
            list.addAll(MazepathList(row - 1, col,Pro+"V"));
        }
        if (col > 1) {
            list.addAll(MazepathList(row, col - 1,Pro+"H"));
        }
        return list;
    }

}
