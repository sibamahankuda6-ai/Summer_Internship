// Input-{23,55,57,93,10,1}
//Output-{5,1,3,3,1,1} ( Sum of each element up to single digit )
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array25 {
    public int singleDigitSum(int num) {
        while (num > 9) {
            int sum = 0;

            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }

    public static void main(String[] args) {

        Array25 obj = new Array25();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output: {");
        for (int i = 0; i < size; i++) {
            System.out.print(obj.singleDigitSum(arr[i]));

            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
