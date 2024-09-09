package chapter5.ArraysAndList;
import java.util.*;
public class assigment {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5};
// problem no 1 product of element
    /* System.out.println("problem 1 solution");
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];//arr ke sare element product ke ke andar daal do
        }
        System.out.println("product of element: " + product);
    */

//probem no 2 second largest value
    /* System.out.println("problem 2 solution");
        int[] arr1 = {-45, -66, -55, -6, -3, -90, -66};
    //  int mx=arr[0];
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > mx) mx = arr1[i];
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != mx) smx = Math.max(smx, arr1[i]);
        }
        System.out.println(" largest elemnent is: " + mx);
        System.out.println("second largest" + smx);
    */

//problem no 3  min value
    /* System.out.println("problem 3 solution");
        int[] arr2 = {45, 66, 55, 63, 90, 66};
     // int mx=arr[0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) min = arr2[i];
        }
        System.out.println("minumun element is : " + min);
        // System.out.print(min);
    */

//problem no 4 Dupicate element in the array
    /* System.out.println("problem 4 soln");
        int[] arr4 = {1, 2, 3, 4, 3, 6, 7, 6, 8, 9, 9, 7, 8};
        findDupicate(arr4);
    }
    public static void findDupicate(int[] arr4) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        System.out.print("duplicate element are :");
        for (int ele : arr4) {
            if (!uniqueElements.add(ele)) {//check ele is present in in uniqueElement set
                duplicateElements.add(ele);
            }
        }
        for (int duplicate : duplicateElements) {
            System.out.print(duplicate + " ");
    */

//problem no 5 smallest missing element
    /*
    int arr5[] = {1, 4, 65, 7, 8, -1};
    int n = arr5.length;
    int smallestMissing = findSmallestMissingPositive(arr);
    System.out.println("smallest missing element is:"+smallestMissing);
    */

//problrm no 6 Count the number of elements strictly greater than x
    /* int []arr6 = {13,5,7,23,10,7,8,4,3,1,3,55};
    int n= arr6.length;
    int x=6;
    int count =0;
    for(int ele: arr6){
    if(ele>x){
    count++;
    }
}
System.out.print("number of element is strictly greater than" + x + ":");
System.out.println(count);
*/

//problem no 7 largest of three element

    /*    int[] arr7 = {45, 65, 55, 3, 90, 66}; // Example array
        int mx = Integer.MIN_VALUE;
        for (int ele : arr7) {
            if (ele > mx) mx = ele;
        }
        int smx = Integer.MIN_VALUE;
        for (int ele : arr7) {
            if (ele != mx) smx = Math.max(smx, ele);
        }
        int tmx = Integer.MIN_VALUE;
        for (int ele : arr7) {
            if (ele != mx && ele != smx) tmx = Math.max(tmx, ele);
        }
        System.out.println("Largest element is: " + mx);
        System.out.println("Second largest is : " + smx);
        System.out.println("Third largest is : " + tmx);
        */

//problem no 8 check the array is sorted or not
    /*    int[] arr = {3, 5, 7, 9, 10, 12}; // Example array
        boolean sorted = isSorted(arr);
        if (sorted) {
            System.out.println("sorted in non-decreasing order");
        } else {
            System.out.println("sorted in non-decreasing order");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true; */

//P9 Find the difference between the sum of elements at even indices to the sum of elements at odd indice
/*     int[] arr9 ={1,2,3,4,5,6};
        int sumEven = 0;
        int sumOdd = 0;
        for(int i=0; i<arr9.length-1; i++){
            if(i%2==0){
                sumEven +=arr9[i];
            }
            else {
                sumOdd += arr9[i];
            }
        }
        int difference = sumEven-sumOdd;
        System.out.println("the diff betn is:"+ difference);
         */

//problem no 10

//problem no 11 unique number
/*                int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1}; // Example array with one unique number
                int uniqueNumber = findUniqueNumber(arr);
                System.out.println("The unique number in the array is: " + uniqueNumber);
            }
            public static int findUniqueNumber(int[] arr) {
                int result = 0;
                for (int num : arr) {
                    result ^= num; // XOR each element of the array
                }
                return result;

 */
//problem no 12 check palindrome
/*int[] arr12 ={1,2,3,3,2,1};
//int n= arr12.length;
boolean  palindrome = checkPalindrome(arr12);
if(palindrome){
    System.out.println("it is palindrome ");
}
else{
    System.out.println("not palindroeme");
}}
public static boolean checkPalindrome(int[] arr12){
    int n= arr12.length;
    int i=0;
    int j=n-1;
    while(i<j){
        if(arr12[i]!=arr12[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;

 */
//problem n0 14
    int[] num1={11,33,42,71};
    int [] num2 = {26,54,69,81};
    int[]c= new int[num1.length+ num2.length];
    int i=0,j=0,k=0;
    while(i<num1.length && j<num2.length){
        if(num1[i]<=num2[j]){
            c[k]=num1[i]; k++;
            i++;
        }
        else{
            c[k]=num2[j];
            j++; k++;
        }
        if(i==num1.length){//now take element only b
            while(j<num2.length){
                c[k]= num2[j];
                j++; k++;
            }
        }
        if(j==num2.length){//now take element only b
            while(i<num1.length){
                c[k]= num1[i];
                i++; k++;
            }
        }
    }
    for(int ele: c){
        System.out.print(ele +" ");
    }
    System.out.println();
        }
}
