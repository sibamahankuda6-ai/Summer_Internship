//Write a Java program to find 2nd smallest element in a given array.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array23 {
    static void main(String[] args) {


        Array23 obj = new Array23();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int r =obj.secondSmallest(arr,size);
        System.out.println("the second smallest element is : " + r);
    }
    public int secondSmallest(int arr[],int size){
        int smallest =arr[0];
        int secondSmallest = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest =arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest =arr[i];
            }
        }
        return secondSmallest;
    }

}
