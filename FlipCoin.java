package practice1;

import java.util.Scanner;

public class FlipCoin {
    public static void headTail() {

        if (Math.random() < 0.5){
                    System.out.println("Heads");
                }else{
                    System.out.println("Tails");
                }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Give a number:" );
                        int r= sc.nextInt();
        headTail();
    }
}
