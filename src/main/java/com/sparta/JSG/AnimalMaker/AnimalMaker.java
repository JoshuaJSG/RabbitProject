package com.sparta.JSG.AnimalMaker;

import java.util.List;
import java.util.Random;

public class AnimalMaker {

    private int name;
    private int age;
    private String gender;
    private boolean canRabbitBreed;
    private int month = 1;


    public AnimalMaker(int name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public AnimalMaker(){

    }

    public boolean canBreed(){
        if (getMonth() >= 3){
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

    public int getMonth(){
        return month;
    }

    public void incrementMonth(){
        int month = getMonth();
        month++;
    }

    public String returnGender(){
        int min = 0;
        int max = 1;
        Random random = new Random();
        int gender = random.nextInt((max-min) +1) + min;
        if (gender == 0){
            return "Male";
        }
        else{
            return "Female";
        }
    }
}
