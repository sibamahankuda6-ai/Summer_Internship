//Write a Java program to convert 0 into -1 and -1 into 0.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array24 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array element:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(
                "Array elements are:"
        );
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
            else if(arr[i]==-1){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
