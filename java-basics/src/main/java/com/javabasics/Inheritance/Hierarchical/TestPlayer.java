package com.javabasics.Inheritance.Hierarchical;

public class TestPlayer {

    public static void main(String[] args) {
        Player player = new Player();
        player.cricket();
        player.hockey();
        // player.football();         // Compile Error since player does not inherit "Football" class
    }
}
