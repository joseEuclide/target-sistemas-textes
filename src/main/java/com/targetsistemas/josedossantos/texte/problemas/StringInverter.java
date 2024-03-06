package com.targetsistemas.josedossantos.texte.problemas;
import java.util.Scanner;


/**
 * 
 * @author Jose dos Santos
 * @version 1.0.0
 * 
 *  Linkedin: https://www.linkedin.com/in/jose-dos-santos-b633b317a/
 */





public class StringInverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to invert: ");
        String original = scanner.nextLine();
        String inverted = invertString(original);
        System.out.println("Original String: " + original);
        System.out.println("Inverted String: " + inverted);
        scanner.close();
    }

    public static String invertString(String str) {
        char[] characters = str.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }
        return new String(characters);
    }
}

