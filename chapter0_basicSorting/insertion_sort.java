package chapter0_basicSorting;

public class insertion_sort {

        public static void print(int[] arr) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            int[] arr = {28, 4, 5, 9, 2};
            int n = arr.length;
//            for (int i = 0; i < n - 1; i++) {
//                int min = Integer.MAX_VALUE;
//                int mindx = -1;
//                for (int j = 1; j < n; j++) {
//                    if (arr[j] < min) {
//                        min = arr[j];
//                        mindx = j;
//                    }
//                    swap(arr, i, mindx);
//                }

            for(int i=0; i<n; i++){
                int j=i;
                while(j>=1 && arr[j]<arr[j-1]){
                    swap(arr,i,j);
                    j--;
                }
                //System.out.println(" minnimum number "+min +" "+"and its index "+mindx);
                //kis index par lie karta hain es liye ek variable create karna hai
                //does not optimization
            }
            print(arr);
        }
    }

