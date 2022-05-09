package com.company.lecture9;

import java.time.Year;
import java.util.Objects;

public class Person {

    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private final String nationality;
    private final String EGN;
    private final int dateOfBirth;
    private final int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpoken, String job, String nationality, String EGN, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        if (EGN.length() != 10) {
            throw new IllegalArgumentException("EGN must be 10 digits");
        } else {
            this.EGN = EGN;
        }
        this.dateOfBirth = Integer.parseInt(EGN.substring(4));
        this.age = calculateAge(EGN);
        this.countryOfResidence = countryOfResidence;
    }

    public Person(String name, String sex, String religion, String languageSpoken, String nationality, String EGN, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.nationality = nationality;
        if (EGN.length() != 10) {
            throw new IllegalArgumentException("EGN must be 10 digits");
        } else {
            this.EGN = EGN;
        }
        this.dateOfBirth = Integer.parseInt(EGN.substring(4));
        this.age = calculateAge(EGN);
        this.countryOfResidence = countryOfResidence;
    }
    private int calculateAge(String EGN) {

        int year = Year.now().getValue();
        String testYear = "19" + EGN.substring(0,2);
        return year - Integer.parseInt(testYear);
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void celebrateEastern() {
    }

    public void isAdult() {

    }

    public void canTakeLoan() {
        if (this.job == null || this.job.equals("n/a")){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
    }
}
