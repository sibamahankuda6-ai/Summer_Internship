//Input-{23,55,57,93,1}
//Output-{32,55,75,39,1} ( Reverse each element )
package Summer_Internship.ArrayPrograms;
import  java.util.Scanner;
public class Array28 {
    static int reverseNumber(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output-{");
        for (int i = 0; i < size; i++) {
            System.out.print(reverseNumber(arr[i]));

            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
