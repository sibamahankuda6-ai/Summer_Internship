//Write a Java program to print even elements sum.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array8 {
    static void main(String[] args) {

        Array8 ob = new Array8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ob.sumOfEvenElements(arr, size);
    }
    void sumOfEvenElements(int arr[],int size){
        int sumEven =0;
        for(int i=0;i<size;i++) {

            if (arr[i] % 2 == 0) {
                sumEven = sumEven + arr[i];
            }
        }
        System.out.println("sum of even elements :" + sumEven);
    }

}
