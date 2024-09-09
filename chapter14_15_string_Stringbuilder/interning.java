package chapter14_15_string_Stringbuilder;

public class interning {
    public static void main(String []args){
        //interning
        String s= "Raghav";
        String q= "Raghav";
        String t= "Madhav";

        //change Raghav to Madhav
        //s.charAt(0) = 'm';
//        s.charAt(2) = 'd';
        s= "Madhav";
        System.out.println(s);
        //new keyWord
        String c= new String("Raghav");
        System.out.println(c);
    }
}
