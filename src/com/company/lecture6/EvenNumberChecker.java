package com.company.lecture6;

public class EvenNumberChecker {

    public static void main(String[] args) {
        int firstNum = 2;
        System.out.println(isEven(firstNum));
        int secondNum = 3;
        System.out.println(isEven(secondNum));
        int thirdNum = -7;
        System.out.println(isEven(thirdNum));
    }

    public static boolean isEven(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 == 0;
    }
}
