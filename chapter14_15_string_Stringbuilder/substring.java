package chapter14_15_string_Stringbuilder;

public class substring {
    public static void main(String []args){
        String s= "abcde";
        System.out.println(s.substring(1));//a
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(2,2));
        System.out.println(s.substring(0,5));
        //
        //substring  using for loop
        String str =  "abcde";
        for(int i=0; i<str.length(); i++){
            for(int j=1; j<str.length(); j++){
                System.out.println(str.substring(i,j)+" ");
            }
        }
        System.out.println();
    }
}
