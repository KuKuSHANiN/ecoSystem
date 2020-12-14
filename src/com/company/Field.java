package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Field {
    int size = 5;
    Scanner in = new Scanner(System.in);

    public void createAnimal() {
        ArrayList<Animal> compareAnimalsPowerInZone = new ArrayList<>();   // создаем динамический массив куда будут
                                                                                        //    заноситься все звери при встрече в точке.

        Animal creature = new Animal();  // создаем зверя
        creature.setName(in.nextLine());
        creature.setPower(in.nextInt());
        creature.setType(in.nextLine());
        creature.setFood(in.nextInt());
        compareAnimalsPowerInZone.add(creature);  //добавляем зверя в дин. массив

        Animal [][] field = new Animal[5][5];  // пробовал и такое String [][] field = new String [5][5]


    }

    public void createStartAnimalInAllField(int size) {

    }
}


