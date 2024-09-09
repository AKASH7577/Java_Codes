package chapter18.BinarSerch.assignmentQ;
/*Q3. Given a matrix having 0-1 only where each row is sorted in increasing order,
find the row with the maximum number of 1’s.*/
public class Q3 {
    public static  int findRowWithMaxones (int[][] matrix) {
        int maxonesRowIndex = -1;
        int row =0;
        int col = matrix[0].length -1;

        while(row <matrix.length && col>=0){
            if(matrix[row][col] == 1){
                maxonesRowIndex = row;
                col --;
            }
            else  row++;
        }
        return maxonesRowIndex;
    }
    public static void main(String[] args) {
        //asign the matrix
        //one method
       /* int[][] matrix = new int[4][4];
        //intialize the matrix
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 1;
        matrix[1][0] = 0;
        matrix[1][1] = 0;
        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[2][0] =1;
        matrix[2][1] =1;
        matrix[2][2] =1;
        matrix[2][3] =1;
        matrix [3][0] =0 ;
        matrix [3][1] = 0;
        matrix [3][2] = 0;
        matrix [3][3] = 0;

        */

        int [] [] matrix = {
                {0,0,0,1},
                {0,1,1,1},
                {0,0,1,1},
                {1,1,1,1}
        };
       int maxonesRowIndex = findRowWithMaxones(matrix);
       System.out.println(" Row with the maximum number of 1s is : " +  maxonesRowIndex);

    }

    }