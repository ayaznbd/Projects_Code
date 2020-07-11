package Lec4;

import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList();

        List.add(5);
        List.add(6);
        List.add(7);
        List.add(10);
        List.add(11);

        System.out.println(List);
        System.out.println(List.get(1));
        System.out.println(List.set(2,6));
        System.out.println(List);

    }
}
