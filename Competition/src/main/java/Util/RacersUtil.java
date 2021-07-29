/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import competition.Racers;

import competition.Config;

/**
 *
 * @author elcan
 */
public class RacersUtil {

    public static void enterRacers() {
        int count = Utils.requireNumber("How many Racers you want to add?(min 2)");

        Config.racers = new Racers[count];
        for (int i = 0; i < count; i++) {
            System.out.println(+(i + 1) + ".Registr");

            Racers rcs = fillRacers();
            Config.racers[i] = rcs;
        }

        System.out.println("Operation succesfully ended:");
        ShowAllRacers();

    }

    public static Racers fillRacers() {
        String name = Utils.requireText("Enter Name");
        String surname = Utils.requireText("Enter Surname");
        int age = Utils.requireNumber("Enter Age");
        int force = Utils.Random(25, 99) + age;
        Racers rcs = new Racers(name, surname, age, force);
        return rcs;

    }

    public static void ShowAllRacers() {

        for (int i = 0; i < Config.racers.length; i++) {
            Racers rcs = Config.racers[i];

            System.out.println((i + 1) + ":  " + rcs.getinfoWithoutForce());
        }

    }

    public static void guessWInner() {
        int guess = Utils.requireNumber("Which racer is the Winner ? \n Enter index of racer ");
        int max= Config.racers[0].getForce();
        for (int i = 0; i < Config.racers.length; i++) {
             
                if ( Config.racers[i].getForce()>max) {
max =  Config.racers[i].getForce();
                }
            

        }
if(max==Config.racers[guess-1].getForce()){
    System.out.println("CONGRATULATIONS Your guess is CORRECT!!!!!!");
} else System.out.println("Your guess is WRONG !!!!!!!!");

        showRacers();



    }
public static void showRacers(){
  

        for (int i = 0; i < Config.racers.length; i++) {
            Racers rcs = Config.racers[i];

            System.out.println((i + 1) + ":  " + rcs.racersInfo());
        }
}
}
