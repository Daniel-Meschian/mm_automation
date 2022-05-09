package com.company.lecture9;

import java.util.Objects;

public class Bulgarian extends Person{

    public Bulgarian(String name, String sex, String religion, String languageSpoken, String job, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, job, nationality, EGN, countryOfResidence);
    }
    @Override
    public void sayHello() {
        System.out.println("Zdravei");
    }

    @Override
    public void celebrateEastern() {
        if (Objects.equals(this.getReligion(), "Orthodox") || Objects.equals(this.getReligion(), "Catholic")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    @Override
    public void isAdult() {
        if (Objects.equals(this.getReligion(), "Bulgaria") || Objects.equals(this.getReligion(), "Italy")) {
            System.out.println("18");
        } else if (Objects.equals(this.getLanguageSpoken(), "Italian")) {
            System.out.println("21");
        }
    }
    @Override
    public void canTakeLoan() {
        super.canTakeLoan();
    }
}
