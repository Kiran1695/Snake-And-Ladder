package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = 0;
        int dice;
        int option;
        System.out.println("Welcome Player");
        while (position <= 100) {
            System.out.println("Enter to roll die");
            int die = scanner.nextInt();
            dice = (int) Math.floor((Math.random() * 10) % 6 + 1);
            System.out.println("The Dice Was Rolled to : " + dice);
            option = (int) Math.floor(Math.random() * 3);
            switch (option) {
                case 0 -> System.out.println("Player action : Nothing");
                case 1 -> {
                    System.out.println("Player Action : Ladder");
                    position += dice;
                }
                case 2 -> {
                    System.out.println("Player Action : Snake");
                    position -= dice;
                    position = position;
                    Math.max(position, 0);
                }
            }
            System.out.println(" congratulations!! You took " + "rolls to win the game!!");
            System.out.println("Player Rolls The Die");
            int randomv = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println(" Number Got " + randomv);
            System.out.println("Current Position " + position);
        }
    }
}
