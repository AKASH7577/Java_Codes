package oops;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;

    }
    public void setName(String n){
        name =n;
    }
    public void setId(int i){
        id = i;

    }
    public int getId(){
        return id;
    }
}

public class accessmodifire {
    public static void main(String [] args){
        MyEmployee akash = new MyEmployee();
        //akash.id =49;
        //akash.name = "rohanshinde"; ---->throws and error due to private access modifire
        akash.setName("rohanshinde");
        System.out.println(akash.getName());
        akash.setId(47457);
        System.out.println(akash.getId());
    }
}
