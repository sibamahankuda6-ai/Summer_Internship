package Summer_Internship.NumberProgram;
import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0,rem;
        int count=0;
        int n=num;
        int temp=num;
        while(num!=0){
            num=num/10;
            ++count;
        }
        while(temp!=0){
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,count);//rem*rem*rem;
            temp=temp/10;

        }
        if(n==sum){
            System.out.println("Amstrong number");
        }
        else{
            System.out.println("not a Amstrong number");
        }

    }
}
