package October.Ex_03102024;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the Month name");
        int month = sc.nextInt();

        switch (month)
        {
            case 1 -> System.out.println("As per your input the month is - January");
            case 2 -> System.out.println("As per your input the month is - February");
            case 3 -> System.out.println("As per your input the month is - March");
            case 4 -> System.out.println("As per your input the month is - April");
            case 5 -> System.out.println("As per your input the month is - May");
            case 6 -> System.out.println("As per your input the month is - June");
            case 7 -> System.out.println("As per your input the month is - July");
            case 8 -> System.out.println("As per your input the month is - August");
            case 9 -> System.out.println("As per your input the month is - September");
            case 10 -> System.out.println("As per your input the month is - October");
            case 11 -> System.out.println("As per your input the month is - November");
            case 12 -> System.out.println("As per your input the month is - December");
            default -> System.out.println(" Enter the number between 1-12 to get the month name.");

        }
    }
}
