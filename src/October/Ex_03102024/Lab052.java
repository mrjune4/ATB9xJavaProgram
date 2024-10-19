package October.Ex_03102024;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int Num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int Num2 = sc.nextInt();
        System.out.println("Enter the Operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' -> System.out.println(Num1+Num2);
            case '-' -> System.out.println(Num1-Num2);
            case '*' -> System.out.println(Num1*Num2);
            case '/' -> System.out.println(Num1/Num2);
            case '%' -> System.out.println(Num1%Num2);
            default -> System.out.println("Incorrect input, please enter the valid input");
        }
    }
}
