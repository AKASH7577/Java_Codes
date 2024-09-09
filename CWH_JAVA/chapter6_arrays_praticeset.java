public class chapter6_arrays_praticeset {
    public static void main(String[] args) {
      /*  //problem 1
        float[] marks ={23.0f,35.9f,56.90f,45.8f,100.0f};
        float sum =0;
        for(float element:marks){
            sum =sum+element;

        }
        System.out.println("The value of sum is" + sum);
*/

        //problem 2
       /* float[] marks ={23.0f,35.9f,56.90f,45.8f,100.0f};
        float sum =23.0f;
        boolean isInArray =false;
        for(float element:marks){
            if(sum ==element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
        System.out.println("The value is present in the arrays");
    }
        else {
            System.out.println("the value is not present in the arrays");
        }
*/

        //probleam no 3
//        float[] marks ={23.0f,35.9f,56.90f,45.8f,100.0f};
//        float sum =0;
//        for(float element:marks){
//            sum =sum+element;
//
//        }
//        System.out.println("The value of average marks  is" + sum/marks.length);
//    }

         //problem no 4

//        int [][] mat1 = {{1, 2,3},
//                         {4,5,6}};
//        int [][] mat2 = {{8,9,2},
//                         {5,8,9}};
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//
//        for(int i=0; i<mat1.length; i++){ //row number of time
//            for(int j=0; j<mat1.length; j++){ //colum number  of time
//                System.out.format("setting value for i=%d and j=%d\n",i,j);
//                result[i][j] = mat1[i][j]+mat2[i][j];
//    }}
//        for(int i=0; i<mat2.length; i++){ //row number of time
//            for(int j=0; j<mat2.length; j++) { //colum number  of time
//                System.out.println(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//
//            System.out.println("");//print a new line

        //problem no 5

//        int [] arr = {1,2,3,4,5,6};
//        int l =arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n; i++){
//            //swap a[i]and a[l-1-i]
//            //a b temp
//            // |4| |3| | |
//            temp  = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//            }
//    for(int element : arr){
//        System.out.println(element + " ");
//    }


    // problem n0 6
//        int [] arr = { 12,34,5,6,7,89,0};
//        int max =0;
//        for(int e: arr){ //arr ko int element me store karte hai
//            if(e>max){
//                max =e;
//            }
//        }
//        System.out.println("the  value of max element is" +max);

        //probleam no 7
        boolean isSorted = true;
        int [] arr = { 12,34,5,6,7,89,0};
        for ( int i=0;i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;

            }
        }
        if(isSorted ){
            System.out.println("the array is sorted ");

        }
        else{
            System.out.println("the array is not sorted");
        }

        }}
