package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome Player");
        int position = 0;
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
