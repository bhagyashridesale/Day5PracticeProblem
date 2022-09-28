package practice1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class swapTwoNumbers {
    public static void swapTwoNumbers() {
        int no1,no2,swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before swapping");
        System.out.println("Enter a first number :");
        no1 = sc.nextInt();
        System.out.println("Enter a second number :");
        no2 = sc.nextInt();

        swap = no1;
        no1 = no2;
        no2 = swap;

        System.out.println("After swapping");
        System.out.println("The First number is:" + no1);
        System.out.println("The Second number is:" + no2);


    }

    public static void main(String[] args) {

        swapTwoNumbers();
    }

}
