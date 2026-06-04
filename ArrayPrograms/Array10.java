// Write a Java program to print the 2nd last element of an array.
//Input-{1,2,3,4,5,6}
//Output-{5}
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array10 {
    static void main(String[] args) {

        Array10 obj = new Array10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.secondLastElement(arr, size);
    }
    void secondLastElement(int arr[],int size){

        for(int i=0;i<size;i++) {

        }
        System.out.println("Second last element :" + arr[arr.length-2]);
    }

}
