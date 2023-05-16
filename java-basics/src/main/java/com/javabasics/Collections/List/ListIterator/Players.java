package com.javabasics.Collections.List.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class Players {

    String name;
    String role;
    int age;

    public Players(String name, String role, int age) {
        this.name=name;
        this.role=role;
        this.age=age;
    }

    public static void main(String[] args) {

        List<Players> player = new ArrayList<>();
        Players p1 = new Players("Sachin","bastman",32);
        Players p2 = new Players("Dhoni","bastman", 26);
        Players p3 = new Players("Bumrah", "bowler", 22);
        Players p4 = new Players("Yuvraj", "all-rounder", 25);
        Players p5 = new Players("Rashid","bowler",19);

        player.add(p1);
        player.add(p2);
        player.add(p3);
        player.add(p4);
        player.add(p5);

        for(int i=0; i< player.size(); i++) {       // Iterating using for-loop
            Players players = player.get(i);
            System.out.println(players.name + " " + players.role + " " + players.age);
        }

        for(Players p : player) {           // Iterating using for-each
            System.out.println(p.name + " " + p.role + " " + p.age);
        }

        player.stream().forEach(players -> {        // Iterating using stream api
            System.out.println(players.name + " " + players.role + " " + players.age);
        });

    }
}
