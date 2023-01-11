package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Welcome Player");
        int dice;
        int option;
        int roll;
        while (position < 100) {
            dice = (int) Math.floor((Math.random() * 10) % 6 + 1);
            System.out.println("The Dice Was Rolled to : " + dice);
            option = (int) Math.floor(Math.random() * 3);
            switch (option) {
                case 0:
                    System.out.println("Player action : Nothing");
                    break;
                case 1:
                    System.out.println("Player Action : Ladder");
                    position += dice;
                    if (position > 100) {
                        position -= dice;
                        System.out.println("Exceeded 100 so not counting");
                    }
                    break;
                case 2:
                    System.out.println("Player Action : Snake");
                    position -= dice;
                    position = position < 0 ? 0 : position;
                    break;
            }
            System.out.println(" current position " + position);
            roll++;
        }
        System.out.println(" congratulations!! You took " + "rolls to win the game!!");
        System.out.println("Player Rolls The Die");
        int randomv = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(" Number Got " + randomv);
        int option = (int) Math.floor(Math.random() * 10) % 3;
        if (option == 0) {
            System.out.println(" Player action : No Play");
        } else if (option == 1) {
            System.out.println(" Player action : Ladder");
            position += randomv;
        } else if (option == 2) {
            System.out.println(" Player action : Snake");
            position -= randomv;
        }
        System.out.println("Current Position " + position);
    }
}
