package practice1;

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        }
            else{
                System.out.println( x + " is odd");

        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int y = scan.nextInt();
        evenOdd(y);
    }
}