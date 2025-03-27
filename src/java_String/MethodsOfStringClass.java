package java_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsOfStringClass {
    public static void methodsOfString(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string on which we will perform some actions :");
        String s1=sc.nextLine();
        System.out.print("Enter a string on which we will perform some actions :");
        String s2=sc.nextLine();
        //String is immutable in nature
        //length
        int length=s1.length();
        System.out.println(length);
        //isEmpty
        System.out.println(s1.isEmpty()); //checks for empty string
        //isBlank
        System.out.println(s1.isBlank());
        //equals
        System.out.println(s1.equals(s2));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s2));
        //charat()
        System.out.println(s2.charAt(2));
        //indexof
        System.out.println(s1.indexOf('d'));
        //lastIndexOf
        System.out.println(s2.lastIndexOf("lo"));
        //substring
        System.out.println(s1.substring(3));
        //substring
        System.out.println(s2.substring(1,5));
        //toUpperCase
        System.out.println(s1.toUpperCase());
        //toLowerCase
        System.out.println(s2.toLowerCase());
        //trim
        System.out.println(s1.trim());
        //replace
        System.out.println(s1.replace('a','#'));
        //replaceAll
        //split
        String s3="apple,banana,orange";
        String[] fruits=s3.split(",");
        for(String fruit:fruits)
            System.out.println(fruit);
        //startsWith
        System.out.println(s1.startsWith("h"));
        //endsWith
        System.out.println(s1.endsWith("k"));
        //concat
        System.out.println(s1.concat(s2));
        //join
        System.out.println(s1.join("@","hello","Jaya"));
        //valueOf
        int i=9;
        System.out.println(String.valueOf(i));
        //contains
        System.out.println(s1.contains("r"));







    }
    public static void main(String[] args) {
    methodsOfString();
    }
}
