package October.Ex_03102024;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=90)
        {
            System.out.println("You have achieved the A grade");
        } else if (marks<=89 && marks>=80) {
            System.out.println("You have achieved the B grade");
        } else if (marks<=79 && marks>=70) {
            System.out.println("You have achieved the C grade");
        } else if (marks<=69 && marks>=60) {
            System.out.println("You have achieved the D grade");
        } else if (marks<=59 && marks >=0) {
            System.out.println("You have achieved the F grade");
        }
        sc.close();
    }
}
