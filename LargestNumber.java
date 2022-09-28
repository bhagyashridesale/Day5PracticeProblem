package practice1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c,large;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=scan.nextInt();

        System.out.println("Enter the second number: ");
        b=scan.nextInt();

        System.out.println("Enter the third number: ");
        c=scan.nextInt();
        large=c>(a>b?a:b)?c:((a>b)?a:b);
        System.out.print("The largest number is:"+large);

    }
}
