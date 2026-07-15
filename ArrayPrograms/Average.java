package Summer_Internship.ArrayPrograms;

import java.util.*;
class Average{
    public static void main(String args[]){
        int arr[]=new int[25];
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int avg;
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/arr.length;
        System.out.println("average=" + avg);

    }
}