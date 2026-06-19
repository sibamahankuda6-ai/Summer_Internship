//Write a Java program to count the number of zeros(0) present in a given array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {

        Array13 obj = new Array13();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.countZero(arr, size);

    }
        void countZero ( int arr[], int size){
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == 0) {
                    count++;
                }
            }
            System.out.println("the numnber of zero is:" + count);
        }
    }




