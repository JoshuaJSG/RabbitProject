package com.sparta.JSG.AnimalMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RabbitMaker extends AnimalMaker{

    private int maleRabbits = 1;
    private int femaleRabbits = 1;
    private boolean isPregnant = true;

    private List<RabbitMaker> rabbits = new ArrayList<>();
    private int amountOfRabbits = rabbits.size();
    RabbitMaker rabbitMaker;

    public RabbitMaker(int name, String gender) {
        super(name, gender);
    }

    public RabbitMaker(){

    }

    /**
    Phase 1 - Rabbits
                * Each second will represent a month
                * Breeding rabbits reach maturity at 3 months
                * The programme will start with a single breeding pair
        * If a male is available a female can be pregnant and give birth in one month
        * Each breeding pair can create between 1-14 offspring that can be a random male or female
                * A female that has given birth can breed again immediately after giving birth
        * Rabbits day at 5 years

 */



//    public void createRabbits(){
//        for (int i = 1; i <=100; i++) {
//            RabbitMaker rabbitMaker = new RabbitMaker(i,"Male");
//            RabbitMaker frabbitMaker = new RabbitMaker(i,"Female");
//            rabbits.add(rabbitMaker);
//            rabbits.add(frabbitMaker);
//            System.out.println(i + " Rabbit Gender = " + rabbitMaker.getGender());
//            System.out.println(i + " Rabbit Gender = " + frabbitMaker.getGender());
//        }
//    }



    public void makeRabbit(int babies){
        List<RabbitMaker> rabbitMakerList = rabbits;
        for (int i = 0; i <babies; i++) {
            rabbitMakerList.add(new RabbitMaker(getName(), getGender()));
        }
    }


    public void breedRabbits(){
        int min = 1;
        int max = 14;
        Random random = new Random();
        int babies = random.nextInt((max-min) +1) + min;
        for (RabbitMaker rabbitMaker: rabbits) {
            if ((rabbitMaker.getGender() == "Female" & rabbitMaker.canBreed(3) & (maleRabbits > 1))){
                makeRabbit(babies);
            }
        }
        System.out.println(rabbits);
    }

    public int getPopulation(){
        return amountOfRabbits;
    }

    public List<RabbitMaker> getRabbits(){
        rabbits.add(new RabbitMaker(0,"Male"));
        rabbits.add(new RabbitMaker(1,"Female"));

        System.out.println(Arrays.toString(rabbits.toArray()));
        return rabbits;
    }







}

