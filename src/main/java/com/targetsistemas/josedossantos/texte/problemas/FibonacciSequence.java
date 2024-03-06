package com.targetsistemas.josedossantos.texte.problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Jose dos Santos
 * @version 1.0.0
 * 
 *  Linkedin: https://www.linkedin.com/in/jose-dos-santos-b633b317a/
 */

public class FibonacciSequence {
	
	 public static List<Integer> generateFibonacciSequence(int targetNumber) {
	        List<Integer> fibonacciSequence = new ArrayList<Integer>();
	        int previousNumber = 0, currentNumber = 1;
	        fibonacciSequence.add(previousNumber);
	        fibonacciSequence.add(currentNumber);
	        while (currentNumber < targetNumber) {
	            int nextNumber = previousNumber + currentNumber;
	            previousNumber = currentNumber;
	            currentNumber = nextNumber;
	            fibonacciSequence.add(currentNumber);
	        }
	        return fibonacciSequence;
	    }

	    public static boolean isNumberInFibonacciSequence(int number, List<Integer> fibonacciSequence) {
	        return fibonacciSequence.contains(number);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it belongs to the Fibonacci sequence: ");
	        int numberToCheck = scanner.nextInt();
	        List<Integer> fibonacciSequence = generateFibonacciSequence(numberToCheck);
	        if (isNumberInFibonacciSequence(numberToCheck, fibonacciSequence)) {
	            System.out.println("The number " + numberToCheck + " belongs to the Fibonacci sequence.");
	        } else {
	            System.out.println("The number " + numberToCheck + " does not belong to the Fibonacci sequence.");
	        }

	        scanner.close();
	    }

}
