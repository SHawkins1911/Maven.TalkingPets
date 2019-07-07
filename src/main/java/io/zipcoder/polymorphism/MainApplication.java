package io.zipcoder.polymorphism;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer numberOfPets;

        ArrayList<Pet> petList = new ArrayList<>();


        System.out.println("How many pets do you have?" + "\nEnter 0 to quit");
        while(!scanner.hasNextInt()){
            System.out.println("That is not a valid number of pets");
            scanner.next();
        }

        numberOfPets = scanner.nextInt();

        if (numberOfPets < 0){
            System.out.println("Looks like you have no pets...Great decision!" + "\nIf you do in fact have pets, restart and enter a positive number.");
        }

        while (numberOfPets > 0){
            while(!scanner.hasNextInt()){
                System.out.println("That is not a valid number of pets.");
                scanner.next();
            }

            for(int i = 0; i < numberOfPets; i++) {
                askForPetType();
                String petType = scanner.next().toLowerCase();

                if (petType.equals("cat")) {
                    askForPetName();
                    String petName = scanner.next();
                    petList.add(new Cat(petName));
                    numberOfPets--;


                } else if (petType.equals("dog")) {
                    askForPetName();
                    String petName = scanner.next();
                    petList.add(new Dog(petName));
                    numberOfPets--;
                } else if (petType.equals("fox")) {
                    askForPetName();
                    String petName = scanner.next();
                    petList.add(new Frog(petName));
                    numberOfPets--;
                } else {
                    System.out.println("Please enter a valid pet type.");
                    i--;
                }
            }
    }
        for(int i = 0; i<petList.size(); i++){
            System.out.println("The animal named " +petList.get(i).getName() + " says " + petList.get(i).speak() + "!");
        }


    }
    private static void askForPetType() {
        System.out.println("Is the pet a cat, dog, or frog?");
    }
    private static void askForPetName() {
        System.out.println("What is the name of that pet");
    }
}

