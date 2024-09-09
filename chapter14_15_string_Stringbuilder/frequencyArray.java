package chapter14_15_string_Stringbuilder;

public class frequencyArray {
    public static void main(String args []){
        String s = "abcdeefffghig";
        //to create freq array 26 size ka philal kali pada hai
        int [] freq = new int [26];
        //0-a,1-b,2-c,......25-2
        //finding the char at index i and convert into int and to take th e index
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = (int)ch-97;
            //index milega jaha par uski value store karni hai
            freq[idx]++;
        }
        //to count the max frequency
        int maxFreq = -1;
        for(int i=0; i<freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
            System.out.println("max frequency: "+maxFreq);

        //if char has same frequency
        for(int i=0; i<freq.length; i++){
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.print("max frequency char is:"+ch+" ");
            }
        }



    }
}
