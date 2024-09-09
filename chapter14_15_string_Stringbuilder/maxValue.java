package chapter14_15_string_Stringbuilder;

public class maxValue {
    public static void main(String [] args){
        //purify maen lesdding '0' ko hatana
        String [] arr = {"133456","1234567890","98765432","3834629","4673829"};
        String maxS = arr[0];
        for(int i=1; i<arr.length; i++){
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
        System.out.println("max value in arr");
    }
    public static String max(String a,String b) {
        String s = purify(a), t = purify(b);
        //no leading zero
        if (s.length() > t.length()) return a;
        if (s.length() < t.length()) return b;
        // has same length()
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        //has same length
        if (a.length() >= b.length()) return a;
        else return b;
    }
        public static String purify (String s){
            //remove the leading 0
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') return s.substring(i);
            }
            return s;
        }

    }
