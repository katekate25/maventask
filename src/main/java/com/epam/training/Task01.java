package com.epam.training;

import java.util.Scanner;

//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

public class Task01 {
    public static void main(String[] args) {
        int num = readNumber();
        checkSumOfNumberPairs(num);
    }

    public static int readNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive four-digit number");
        String num = scanner.nextLine();
        while(isNotValidNumber(num)) {
            System.out.println("Try again");
            num = scanner.nextLine();
        }
        return Integer.parseInt(num);
    }

    public static boolean isNotValidNumber(String num) {
        int x;
        try {
            x = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter an integer!");
            return true;
        }
        return x < 1000 || x > 9999;
    }

    public static boolean checkSumOfNumberPairs(int x) {
        char[] numToArray = Integer.toString(x).toCharArray();
        if (numToArray[0] + numToArray[1] == numToArray[2] + numToArray[3]) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}


