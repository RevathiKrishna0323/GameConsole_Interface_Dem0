package com.io.github;

public class Main {
    public static void main(String[] args) {
        GameConsole gameConsole1 = new Chess();
        gameConsole1.computeScore();
        GameConsole gameConsole2 = new Badminton();
        gameConsole2.computeScore();

    }
}