package java_Array;

import javax.swing.*;
import java.util.Scanner;

public class EvenOddInArray {
    public void checkEvensAndOdds(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of elements :");
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter element"+(i+1));
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            if(a[j] % 2 == 0)
                System.out.println(a[j]+" is even ");
                else
                System.out.println(a[j]+" is odd  ");
        }

    }

    public static void main(String[] args) {
        EvenOddInArray ev=new EvenOddInArray();
        ev.checkEvensAndOdds();
    }
}
