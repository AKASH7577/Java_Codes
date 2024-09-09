import java.util.Scanner;
public class praticeset {
    //taking user input to claculate persentage of cbse board exam

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter phy marks:");
        int phy =scan.nextInt();
        System.out.println("enter english marks :");
        int eng =scan.nextInt();
        System.out.println("enter chem marks:");
        int chem =scan.nextInt();
        System.out.println("enter bio marks :");
        int bio =scan.nextInt();
        System.out.println("enter math marks :");
        int math  =scan.nextInt();


        float percentage =((phy+eng+chem+bio+math)/500.0f)*100;
        System.out.println("percentage :");
        System.out.println(percentage);
    }
}
