package oops;
//java class ke andar 1  hi public class hoti hai
class My2Employee{
    int id;
    int salary;
    String name;
    public  void printDetails(){
        System.out.println("my id is "+id);
        System.out.println("and my name is "+ name);
        System.out.println("my salary" +salary);
    }
    public int  getSalary(){

        return salary;
    }
}

public class classesAndObject {
    //v37 //custom classs
    public static void main(String args[]) {
    System.out.println("1st custom class");
    My2Employee akash= new My2Employee();// Instantiation a new Employee object
    My2Employee rohan = new My2Employee();

    //setting the Attributes
    akash.id = 12;
    akash.salary =90;
    akash.name ="codewithharry";

    //setting the Attributes
    rohan.id = 11;
    rohan.salary= 99;
    rohan.name = "akash shinde";

    //printing the  Attributes
    //System.out.println(akash.id);
    //System.out.println(akash.name);
        
    akash.printDetails();
    rohan.printDetails();
    int salary = akash.getSalary();
    System.out.println(salary);
    }
}
