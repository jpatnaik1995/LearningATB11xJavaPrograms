package java_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter a number till which you want to print the fibonacci series :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int starting=0;
        int second=1;

        System.out.print(starting+","+second+",");
        for(int i=2;i<=num;i++){
            int addition=starting+second;
            System.out.print(addition+",");
            starting=second;
            second=addition;

        }

    }
}
