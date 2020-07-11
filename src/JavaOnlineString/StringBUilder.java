package JavaOnlineString;

public class StringBUilder {
    public static void main(String[] args) {
    StringUseBuilders();
    }
    public static void StringUseBuilders(){
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        sb.setCharAt(0,'B');
        System.out.println(sb);
        sb.insert(0,"Hello");
        System.out.println(sb);
        sb.insert(0,'T');
        System.out.println(sb);
        sb.append('Z');
        System.out.println(sb);
        sb.append("ABCD");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.deleteCharAt(10);
        System.out.println(sb);
        sb.deleteCharAt(10);
        System.out.println(sb);
        sb.deleteCharAt(10);
        System.out.println(sb);
        sb.deleteCharAt(10);
        System.out.println(sb);
        sb.deleteCharAt(10);
        System.out.println(sb);
    }
}
