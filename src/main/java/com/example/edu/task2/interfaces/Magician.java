package com.example.edu.task2.interfaces;

public interface Magician {
    public default void castSpell(String spell){
        System.out.println(String.format("Casting %s spell", spell));
    }

    public void openPortal();
}
