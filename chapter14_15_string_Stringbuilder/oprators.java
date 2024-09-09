package chapter14_15_string_Stringbuilder;
public class oprators {
    public static void main(String [] args){
        String s= " hello ";
        String d = "akash";
       // s+=d; //method1
       // s= s+d; //method2
        //s=s+10; //method 3
       // s= s.concat("how are you"+10+20);//there are 2 posibility 1 ///output is : hello how are you1020
        s= s.concat(10+20+"how are you");//output: 30hello how are you
      //  s=s.concat(10); //gives an error can't add
        System.out.println(s);

    }
}
