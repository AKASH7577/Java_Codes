public class v31_method {
    static int logic(int x,int y){
        int z;
        if(x<y){
            z=x+y;

        }
        else{
            z=(x+y) * 5;
        }
        return z;

    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        int a1 = 10;
        int b1= 12;
        int c1= logic(a1,b1);
       System.out.println(c);
       System.out.println(c1);
       //method can be called by creating a object
          

    }
/* 
     METHOD INVOCATION BY CREATING A OBJECT
     int logic(int x,int y){
        int z;
        if(x<y){
            z=x+y;

        }
        else{
            z=(x+y) * 5;
        }
        return z;

    }
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        int a1 = 10;
        int b1= 12;
        int c1= logic(a1,b1);
       System.out.println(c);
       System.out.println(c1);
       //method can be called by creating a object          
    }*/ 
}
