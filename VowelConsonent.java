package practice1;

import java.util.Scanner;

public class VowelConsonent {
    public static void vowel_Or_Consonant() {
        System.out.print("Enter any Alphabet : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("It is a vowel.");

               else

                System.out.println("It is a consonant.");
               sc.close();

        }

    public static void main(String[] args) {

        vowel_Or_Consonant();

    }
        }



