package com.company.lecture6;

public class PalindromChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrom(12345432));
    }

    public static boolean isPalindrom(int num) {
        String original, reversed = "";
        if (num < 0){
            return false;
        }
        original = String.valueOf(num);
        for (int i = (original.length() - 1); i >=0; --i) {
            reversed += original.charAt(i);
        }
        return reversed.equals(original);
    }
}
