package practice1;

import java.util.Scanner;

public class PowerOfTwo {
    public static void powerOfTwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scan.nextInt();
        while (number % 2 == 0) {
            number = number/ 2;
        }
        if (number == 1) {
            System.out.println("Number is power of two");
        } else {
            System.out.println("Number is not equal to power of two");
        }

    }

    public static void main(String[] args) {

        powerOfTwo();
    }
}
