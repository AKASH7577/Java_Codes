package oops;
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something ");
    }
    public void printColor() {
        System.out.println("the color of pen is" + this.color);
        System.out.println("the type of pen is "+ this.type);
    //use of this keyword : es fuction ko batayega ki eksko es object ne call keya hai
   }
}
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("the name of student  :"+this.name);
        System.out.println(" the age of student :"+this.age);
    }
//Default constructor
//    Student (){
//        System.out.println("constructor is called ");
//    }
    //paramitorized  constructor
//    Student(String name , int age ){
//        this.name = name;
//        this.age = age;
//    }

    //copy construtor
    Student(Student s2){
        this.name = s2.name;
        this.age= s2.age;
    }
    Student (){

    }
}
public class classANdObject2 {
    public static void main(String []args){
        //this is default  constructor
//        Pen pen1 = new Pen();//this s constructor
        //thier are no return type of construtor
        //it call only once when object is created
//
//        pen1.color = "blue";
//        pen1.type= "gel";
//        pen1.write();
//
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "bollpoint";
//
//        pen1.printColor();
//        pen2.printColor();



        //this parametorized construtor
//        Student s1= new Student ("akash ", 20);
//        s1.printInfo();

        //copy constructor
        Student s1 = new Student ();
        s1.name = "akash ";
        s1.age =  24;

        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
