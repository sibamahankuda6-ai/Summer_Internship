package Summer_Internship.NumberProgram;
import java.util.Scanner;

public class EvenOrOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbner");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Enen");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
