package chapter14_15_string_Stringbuilder;

public class indexOf {
    public static void main(String[]args){
        String s = "Akash Shinde";
        System.out.println(s.indexOf('s'));
        ///s.indexOf('s'); printing the starting element
        System.out.println(s.indexOf('k'));
        System.out.println(s.lastIndexOf('A'));
        //s.lastIndexOf('k'); print the last element
        //'compareTo' is used to compare 2 give string lexographically
        String a="abc";
        String b="abcggg";
        System.out.println(a.compareTo(b));

        String c= "physic Wallh Skills ";
        System.out.println(s.contains("all"));
        System.out.println(s.startsWith("phy"));
        System.out.println(s.endsWith("sic"));


    }
}
