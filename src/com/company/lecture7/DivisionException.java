package com.company.lecture7;

import java.util.Scanner;

public class DivisionException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        division(firstNum,secondNum);
    }
    public static void division(int firstNum, int secondNum) {
        try {
            System.out.println(firstNum/secondNum);
        } catch (Exception e) {
            System.out.println("wrong input values / division by 0");
        }
    }
}
