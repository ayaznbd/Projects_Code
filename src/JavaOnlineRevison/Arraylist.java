package JavaOnlineRevison;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println(l);
        System.out.println(l.size());
        l.add(20);
        l.add(10);
        System.out.println(l);
        System.out.println(l.size());
        l.add(30);
        System.out.println(l.size());
        l.remove(1);
        System.out.println(l);
        System.out.println(l.get(0));
    }
}
