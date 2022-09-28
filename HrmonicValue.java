package practice1;

import java.util.Scanner;


public class HrmonicValue {
    public static void main(String[] args) {

        System.out.print("Enter any number : ");
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();

        double result = 0.0;

        System.out.println("The harmonic series is: ");


        for (int i = num; i > 0; i--) {

            result = result + (double) 1 / i;
            System.out.print(result + ", ");
        }
    }
}