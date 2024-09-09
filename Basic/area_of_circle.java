package Basic;

public class area_of_circle {
    public static void main(String[] args) {
        double r = 9;
        double a =3.14*r*r;
        System.out.println("area of circle is :" +a);

        //example no.2 clacualte simple interest
        double p =2000;
        double e = 4.75;
        double t =3.5;
        double si =(p*e*t)/100;
        System.out.println("simple intrest is :" +si);

        //example no.3 calculate volume of sphere

        double R = 3.7;
        double v =(4*3.14*R*R*R)/3;
        System.out.println("volume of sphere is " +v);


    }
}
