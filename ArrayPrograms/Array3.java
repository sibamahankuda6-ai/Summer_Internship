// Write a Java program to print odd index values of an array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array3 {
    static void main(String[] args) {

        Array3 obj = new Array3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("odd array index:");
        obj.printOddIndex(arr, size);
    }
    void printOddIndex(int arr[],int size){

        for(int i=0;i<size;i++){

            if (arr[i] % 2 == 1) {
                System.out.println(i);
            }



        }
    }
}

