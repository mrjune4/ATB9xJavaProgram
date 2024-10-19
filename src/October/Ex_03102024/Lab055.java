package October.Ex_03102024;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to convert");
        int value = sc.nextInt();
        System.out.println("Select the choice of conversion: Choice 1= Fahrenheit to Celsius and Choice 2: kilometers to miles");
        int value2 = sc.nextInt();

        switch (value2){
            case 1 -> System.out.println("The Fahrenheit to Celsius is: "+ ((value-32)*5/9));
            case 2 -> System.out.println("The kilometers to miles is "+ (value/1.609));
        }

    }
}
