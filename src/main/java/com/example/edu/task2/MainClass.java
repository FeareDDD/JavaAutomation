package com.example.edu.task2;

import com.example.edu.task2.classes.Warrior;
import com.example.edu.task2.classes.Trader;
import com.example.edu.task2.classes.Bandit;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Warrior witcherWarrior = new Warrior();
        witcherWarrior.useMagickSign("Igni");
        System.out.println(witcherWarrior.getMonsterInfoByName("Vampire"));

        Trader regularTrader = new Trader();
        regularTrader.sleep();
    }
}
