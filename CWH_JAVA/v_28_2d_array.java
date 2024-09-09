public class v_28_2d_array {
    public static void main(String[] args) {
        int[] marks; //2-D array
        int[][] flats; //2-D array
        flats = new int[2][3]; // 2 floar me  3 ghar
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;


        System.out.println("printing using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats.length; j++) {
                System.out.println(flats[i][j]);  ///called array traversal
                System.out.println(" ");
            }
            System.out.println("");
            }
        }
    }