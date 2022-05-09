package com.company.lecture9;

public class PersonApp {

    public static void main(String[] args) {

        American american = new American("Jon", "male", "Orthodox", "American", "QA", "USA", "9511090947", "USA");

        american.sayHello();
        american.celebrateEastern();
        System.out.println(american.getLanguageSpoken());
        american.isAdult();
    }
}
