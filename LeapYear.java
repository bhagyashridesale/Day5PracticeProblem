package practice1;


import java.util.Scanner;

public class LeapYear {
    public static void checkLeapYear() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();

         if (year % 400 == 0) {

            System.out.println("It is a leap year");
        } else if (year %100 ==0) {
            System.out.print("It is not a leap year");
        }
        else if (year %4 == 0) {
            System.out.println("It is a leap year");
        } else{
            System.out.println("It is not a leap year");
        }


    }

    public static void main(String[] args) {
        checkLeapYear();
    }

}
