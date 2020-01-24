package com.example.edu.task2.classes;

import com.example.edu.task2.interfaces.Witcher;

import java.util.List;

public class Warrior extends Human implements Witcher {
    @Override
    public void walk() {
        System.out.println("Omg, I am walking ( ͡° ͜ʖ ͡°)");
    }

    @Override
    public void sleep() {
        System.out.println("Omg, I am walking ( ͡° ͜ʖ ͡°)");
    }
}
