/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculater;

import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        double num1, num2, result;
        char ope;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = s.nextDouble();
        System.out.println("Enter Second number");
        num2 = s.nextDouble();
        System.out.println("Enter mathimatical operator");
        ope = s.next().charAt(0);

        switch (ope) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = "+result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result = "+result);
                if(num2==0){
                    System.out.println("cannot divide by Zero");
                }
                break;
        }
    }

}
