package October.Ex_03102024;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(addition(num1,num2));
        System.out.println(subtraction(num1,num2));
        System.out.println(multiplication(num1, num2));
        System.out.println(division(num1, num2));


    }
    static String addition(int a, int b){

        return "Addition of two numbers is: "+(a+b);
    }
    static String subtraction(int a, int b){
        return "subtraction of two numbers is: "+(a-b);
    }
    static String multiplication(int a, int b){
        return "Multiplication of two numbers is: "+(a*b);
    }
    static String division(int a, int b){
        return "Division of two numbers is: "+(a/b);
    }
}
