package com.sparta.JSG;

import com.sparta.JSG.AnimalMaker.RabbitMaker;
import com.sparta.JSG.Display.DisplayPopulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

    RabbitMaker rabbitMaker = new RabbitMaker(0,"Male");
//    rabbitMaker.breedRabbits();

    new DisplayPopulation().displayPopulation();

        List<RabbitMaker> rabbitMakers = new ArrayList<>();
        List<RabbitMaker> rabbitMakers2 = new ArrayList<>();
        for (RabbitMaker rabbitMaker1: rabbitMakers) {
            rabbitMakers2.add(0,new RabbitMaker(0,"male"));
            System.out.println(rabbitMaker1.getName());

        }



    }
}
