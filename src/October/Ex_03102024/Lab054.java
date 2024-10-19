package October.Ex_03102024;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day in DD format");
        int dobDay = scanner.nextInt();
        System.out.println("Please enter the month in MM format");
        int dobMonth = scanner.nextInt();
        System.out.println("Please enter the year in YYYY format");
        int dobYear = scanner.nextInt();

        int todayDay = 19;
        int todayMonth = 10;
        int todayYear = 2024;

        //Day Difference Calculation
        if (dobDay>todayDay){
            System.out.println("The day difference is: " + (dobDay-todayDay) + " day/s");
        } else if (dobDay<todayDay) {
            System.out.println("The day difference is: " +(todayDay-dobDay)+ " day/s");

        } else {
            System.out.println("The day difference is: " + 0 +" day");

        }
        //Month Difference Calculation
        if (dobMonth>todayMonth){
            System.out.println("The day difference is: " + (dobMonth-todayMonth)+" Month/s");
        } else if (dobMonth<todayMonth) {
            System.out.println("The day difference is: " +(todayMonth-dobMonth)+" Month/s");

        } else {
            System.out.println("The day difference is: " + 0 +" Month");

        }



    }
}
