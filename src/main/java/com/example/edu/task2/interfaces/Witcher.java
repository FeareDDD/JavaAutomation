package com.example.edu.task2.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Witcher {
    public default void useMagickSign(String magickSignName){
        System.out.println(String.format("using %s sign", magickSignName));
    }

    public default void usePotion(List<String> listOfPotions){
        /*for (String element : listOfPotions){
            System.out.println(element);
        }*/
        listOfPotions.stream().forEach(System.out::println);
    }

    public default String getMonsterInfoByName(String name){
        Map<String, String> bestiary = new HashMap<>();
        bestiary.put("Vampire", "Vampire is a hypernym used to refer to a number of creatures that thrive on blood");
        bestiary.put("Necrophage", "Necrophage is a hypernym used to refer to monsters that generally haunt cemeteries and battlefields");
        bestiary.put("Draconid", "Draconid is a hypernym used to refer to a number of large semi-reptiles");

        String info = String.valueOf(bestiary.entrySet().stream()
                .filter(e -> name.equals(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst());

        return info;
    }
}
