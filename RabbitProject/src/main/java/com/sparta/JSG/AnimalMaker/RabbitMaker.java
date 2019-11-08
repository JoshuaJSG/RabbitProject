package com.sparta.JSG.AnimalMaker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RabbitMaker extends AnimalMaker{

    private List<RabbitMaker> rabbitMakers = new ArrayList<>();



    public RabbitMaker(int name, String gender) {
        super(name, gender);
    }

    /**
    Phase 1 - Rabbits
                * Each second will represent a month
                * Breeding rabbits reach maturity at 3 months
                * The programme will start with a single breeding pair
        * If a male is available a female can be pregant and give birth in one month
        * Each breeding pair can create between 1-14 offspring that can be a random male or female
                * A female that has given birth can breed again immediately after giving birth
        * Rabbits day at 5 years

 */



    public void createRabbits(){
        for (int i = 0; i < 100; i++) {
            RabbitMaker rabbitMaker = new RabbitMaker(i,"Male");
            rabbitMakers.add(0,new RabbitMaker(0,"Female"));
            rabbitMakers.add(1,new RabbitMaker(0,"Male"));

            rabbitMakers.add(rabbitMaker);
            System.out.println(i + " Rabbit Gender = " + rabbitMaker.getGender());
        }
    }


//    public void breeding(){
//        for (RabbitMaker rabbit: rabbitMakers) {
//            if (rabbit.getGender() == "Male")
//
//        }
//    }







}

