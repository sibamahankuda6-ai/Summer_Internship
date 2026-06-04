//Write a Java program to print the sum of an array of elements.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array6 {
    static void main(String[] args) {

        int sum =0;
        Array6 obj = new Array6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        obj.sumOfArrayElements(arr, size);
    }
    void sumOfArrayElements(int arr[],int size){
        int sum =0;
        for(int i=0;i<size;i++){
          sum = sum + arr[i];
        }
        System.out.println("the sum of the array elements is:" + sum);
    }
}
