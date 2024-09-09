package chapter14_15_string_Stringbuilder;

public class stringBuilder {
    public static void main(String [] args){
//        String s= "abc";
        StringBuilder sb= new StringBuilder("abc");
        StringBuilder tb = new StringBuilder("xyz");
        System.out.println(sb);

        //checking the length and capacity
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //string builder function
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());

        //setCharAt();
        sb.setCharAt(1,'#');
        System.out.println(sb);
    }
}
