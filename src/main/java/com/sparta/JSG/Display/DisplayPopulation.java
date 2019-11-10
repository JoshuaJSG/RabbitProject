package com.sparta.JSG.Display;

import com.sparta.JSG.AnimalMaker.RabbitMaker;

public class DisplayPopulation {
RabbitMaker rabbitMaker = new RabbitMaker();


    public void displayPopulation(){
        rabbitMaker.breedRabbits();
        for (int i = 0; i <rabbitMaker.getPopulation(); i++) {
            System.out.println(i + "Rabbits " + rabbitMaker.getRabbits());

        }
    }

}
