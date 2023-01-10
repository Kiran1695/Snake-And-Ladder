package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome Player");
        int position = 0;
        System.out.println("Player Rolls The Die");
        int randomv = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println(" Number Got " + randomv);
    }
}
