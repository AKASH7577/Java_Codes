package chapter14_15_string_Stringbuilder;

public class indexOf_CompaTo {
    public static void main(String[] args){
        String s = "akash shinde";
        String b= "rohan shinde";
        System.out.println("printting the starting index");
        System.out.println(s.indexOf("a"));
        //gives index no of a from left to rightsout
        System.out.println("printing the lastindex");
        System.out.println(s.lastIndexOf("n"));
        //comparer to used to compare given to string hexagraphically
        System.out.println("comparing the two string ");
        System.out.println(s.compareTo(b));
        //conatin()and startwith()
        System.out.println("checking the starting with latter");
        System.out.println(s.startsWith("ak"));


        //substring(i) and substring (i,j);
        String str = "abcdefg";
        System.out.println("printing the index latter char");
        System.out.println(str.substring(3));
        System.out.println(str.substring(1,5));
        System.out.println(str.substring(1,4));
        //System.out.println(str.substring(0,10));//gives the errors

        
    }
}
