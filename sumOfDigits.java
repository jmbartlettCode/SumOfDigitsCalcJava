/*
 * Josh Bartlett
 * Purpose: To add the sum of the digits
 * April 20, 2019
 * Bellevue University
 * sumOfDigits.java
 */

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for input, declare inputNum variable, 
        // add input to variable inputNum
        System.out.print("Enter a number between 0 an 1000: ");
        int inputNum = input.nextInt();
        
        // declares variable a, adds ones digit to variable a 
        int a = inputNum % 10;
        
        // declares variable b, adds tens digit to variable b
        int b = (inputNum / 10) % 10;
        
        // declares variable c, adds hundreds digit to variable c
        int c = (inputNum / 100) % 10;
        
        // declares variable finalNum, adds all digits together,
        // adds that sum to variable finalNum
        int finalNum = a + b + c;
        
        // display result to output
        System.out.println("The sum of the digits is " + finalNum);
        
    }
}