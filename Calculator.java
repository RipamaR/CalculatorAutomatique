package Javacalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter first number: \n");
        double fnum = input.nextDouble();
        System.out.println("\nEnter an operation sign such as, '+', '-', '*', or '/', '=': \n");
        char operator = input.next().charAt(0);
        System.out.println("\nEnter second number: \n");
        double snum = input.nextDouble();
        input.close();

        switch(operator) {

            case '+':
                double answer = fnum + snum;
                System.out.println("\n" + fnum + " " + operator + " " + snum + " = " + answer);
                break;
            case '-':
                double answer1 = fnum - snum;
                System.out.println("\n" + fnum + " " + operator + " " + snum + " = " + answer1);
                break;

            case '*':
                double answer2 = fnum * snum;
                System.out.println("\n" + fnum + " " + operator + " " + snum + " = " + answer2);
                break;

            case '/':
                double answer3 = fnum / snum;
                System.out.println("\n" + fnum + " " + operator + " " + snum + " = " + answer3);
                break;

            default:
                System.out.println("Wrong choice for operator. ");
                break;
        }
    }

	}
    

