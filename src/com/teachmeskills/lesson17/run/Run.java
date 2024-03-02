package com.teachmeskills.lesson17.run;

import com.teachmeskills.lesson17.funcInterface.FunctionalInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains a method for reversing a string
 * or finding the factorial of a number depending on the number entered
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Enter the number 1 or 2: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == 1){
                FunctionalInterface<String> a;
                a = (str) -> {
                    return new StringBuilder(str).reverse().toString();
                };
                System.out.println(a.doSomething("Alina"));
            } else if (num == 2){
                FunctionalInterface<Integer> b;
                b = (number) -> {
                    int count = 1;
                    if (number == 0){
                        count = 1;
                    }
                    for(int i = 1; i <= number; i++){
                        count *= i;
                    }
                    return count;
                };
                System.out.println(b.doSomething(4));
            } else {
                System.out.println("You must enter the number 1 or 2");
            }
        }
        catch (InputMismatchException e){
            System.out.println("You need enter the number 1 or 2");
        }
    }
}
