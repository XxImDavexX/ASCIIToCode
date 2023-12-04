package test;

import java.util.Scanner;

public class ASCISSToCode {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int codeAscii;
        char character;
        System.out.println("Insert de character for to show the code ASCISS:");
        character = keyboard.next().charAt(0);
        codeAscii = character;
        System.out.println("The code of the character is: " + codeAscii);
        
    }
}
