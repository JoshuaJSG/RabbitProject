package com.sparta.JSG.AnimalMaker;

import java.util.List;

public class AnimalMaker {

    private int name;
    private int age;
    private String gender;
    private boolean canRabbitBreed;


    public AnimalMaker(int name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public AnimalMaker(){

    }

    public boolean canBreed(int month){
        if (month >= 3){
            return true;
        }
        return false;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
