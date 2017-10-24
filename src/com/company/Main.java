package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\t" + "\t" + "1 - Eat");
        System.out.println("\t" + "\t" + "2 - Sleep");
        System.out.println("\t" + "\t" + "3 - Toilet");
        Animal myAnimal = new Animal();
        Thread thread = new Thread(myAnimal);
        thread.start();
        Scanner scan = new Scanner(System.in);
        int choice;
        while (thread.isAlive()) {
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    myAnimal.giveEat();
                    break;
                case 2:
                    myAnimal.giveSleep();
                    break;
                case 3:
                    myAnimal.giveToilet();
                    break;
            }

        }
    }

}
