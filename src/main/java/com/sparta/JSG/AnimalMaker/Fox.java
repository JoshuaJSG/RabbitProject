package com.sparta.JSG.AnimalMaker;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**Phase 1 - Rabbits
Phase 2 - Reporting
* We need to capture and manage the data of the rabbit population
* We need to report on
1. Time passed
3. The number of male and female rabbits at the end of the time cycle
* We also need to run the programme based on a defined time period
Phase 3 - Predators
* We will now introduce predators to affect the rabbit population
* A single Fox breeding pair will be introduced
* A fox will breed once a year
* They have between 1-10 kits
* They reach breeding maturity in 10 months
* While food is available a single fox can eat up to 20 rabbits a month*/

public class Fox extends AnimalMaker{
    RabbitMaker rabbitMaker = new RabbitMaker();
    List<Fox> foxes = new ArrayList<>();


    public Fox(int name, String gender) {
        super(name, gender);
    }

    public void makeFox(int babies){
        for (int i = 0; i <babies; i++) {
            foxes.add(new Fox(i, getGender()));
        }
    }

    public void breedFoxes(){
        int min = 1;
        int max = 10;
        Random random = new Random();
        int babies = random.nextInt((max-min) +1) + min;
        for (Fox fox: foxes) {
            if ((fox.getMonth() >=10)){
                makeFox(babies);
            }
        }
    }

    public void eatRabbits(){
        List<RabbitMaker> makerList;
        while (rabbitMaker.isAvailable()){
            makerList = rabbitMaker.getListOfRabbits();
            for (int i = 0; i <(makerList.size() - makerList.size()) + 20; i++) {
                makerList.remove(i);
            }
        }
    }

}
