package chapter10_methods;

public class program_1 {
    public static void checkAlphabet(char ch){
        ch = Character.toLowerCase(ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                if(Character.isLetter(ch)) {
                    System.out.println("consonant");

                }
                else {
                    System.out.println("not an alphabet");
                }
                break;

        }

    }
    public static void main(String[] args){

        checkAlphabet('a');
        checkAlphabet('e');
        checkAlphabet('i');
        checkAlphabet('o');

    }
}
