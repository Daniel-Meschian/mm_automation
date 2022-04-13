package com.company.lecture6;

public class WordsCounter {

    public static void main(String[] args) {

        String sentence = "Lorem ipsum dolor sit amet.";
        System.out.println(counter(sentence));

    }
    //first approach that i think of
    public static int counter(String sentence) {
        String[] arr = sentence.split(" ");
        return arr.length;
    }
}
