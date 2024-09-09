package oops;
class Base{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base and setting c now ");
        this.x= x;
    }
    public void printme(){
        System.out.println("I am a comstructor ");
    }
}
class Derived extends Base{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

public class inheritance {
    public static void main(String [] args ){
        //creating a objet of base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        //creating a object of derived class
        Derived d  = new Derived();
        d.setY(7);
        System.out.println(d.getY());



    }

}
