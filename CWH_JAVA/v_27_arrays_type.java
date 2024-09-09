public class v_27_arrays_type {
    public static void main(String[] args) {
        /*float [] marks ={ 45.0f,45.54f, 55.0f};
        String [] students = {"harry", "rohan", "shubham", "lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);         */

    int [] marks ={34,56,77,87,90,23,44,56};
    System.out.println(marks.length);
    //displaying the array simple methods
        System.out.println("printing using nive methos");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);


        //dispalting using for loop
        System.out.println("printing using for loop");
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);  ///called array traversal


            //quick quig  displaying array in reverse order
//            for(int i=marks.length-1; i>=0; i-- ){
//                System.out.println(marks[i]);
//            }

            //displaying the array using for each loop
            System.out.println("printing using for each loop");
            for(int element : marks){
                System.out.println(element);
            }
        }



    }
}
