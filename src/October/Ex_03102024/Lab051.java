package October.Ex_03102024;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of Side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of Side 3");
        int side3 = sc.nextInt();

        if (side1 == side3 && side2 == side3)
        {
            System.out.println("It is a Equilateral triangle");
        } else if (side1 == side3 || side2 == side3 || side1==side2) {
            System.out.println("It is a Isosceles triangle");
        } else if ((side1&side2) != side3){
            System.out.println("It is a Scalene triangle");

        }
    }
}
