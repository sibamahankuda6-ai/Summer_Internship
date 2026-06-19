// Write a Java program to print an array's last index value of a given element.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {

        Array15 obj = new Array15();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key;");
        int key = sc.nextInt();

        obj.lastIndexValue(arr, size, key);

    }
    void lastIndexValue( int arr[], int size,int key){
       int lastIndex = -1;
       for(int i=0;i<size;i++){
           if(arr[i]==key){
               lastIndex = i;
           }
       }
        System.out.println("the array's last index value of a given element is:" + lastIndex);
    }
}
