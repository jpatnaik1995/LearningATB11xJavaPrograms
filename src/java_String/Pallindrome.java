package java_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pallindrome {

    public static void isPallindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line/word:");
        String originalString=sc.nextLine();
        int sizeOfOS=originalString.length();
        String reverse="";
        for(int i=(sizeOfOS-1);i>=0;i--){
            reverse=reverse+originalString.charAt(i);
        }
        if(originalString.equals(reverse)){
            System.out.println(reverse +" is a pallindrome");
        }else {
            System.out.println(reverse + " is not a Pallindrome");
        }
        }
    public static void main(String[] args) {
    isPallindrome();
    }
}
