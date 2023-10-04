package generic;


import Pokemonster.*;

import java.util.ArrayList;
import java.util.List;  // built in

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        List<Integer> sqecialAttackRate = new ArrayList<>();

        skills.add("화염방사");
        skills.add("용의 숨결");
        skills.add("할퀴기");
        sqecialAttackRate.add(90);
        sqecialAttackRate.add(60);
        sqecialAttackRate.add(40);

        for(String skill : skills)
            System.out.println(skill);
        for (Integer Rate : sqecialAttackRate)
            System.out.println(Rate);
    }
}