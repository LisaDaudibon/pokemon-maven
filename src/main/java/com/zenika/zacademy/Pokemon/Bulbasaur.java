package com.zenika.zacademy.Pokemon;

import com.zenika.zacademy.Type.ElementTypes;
import com.zenika.zacademy.Type.Grass;

import java.util.Random;

public class Bulbasaur extends Pokemon implements Grass {
    public static final int POKEDEX_INDEX = 4;

    public Bulbasaur () {
        super();
    }

    public Bulbasaur (int level) {
        super(level);
    }

    @Override
    public String toString() {
        String conclusion = String.format("Pokemon N°%s ", POKEDEX_INDEX);
        String motherString = super.toString();
        return conclusion + motherString;
    }

    @Override
    public void shout() {
        System.out.println("Bulbasaur");
    }

    @Override
    public ElementTypes getType() {
        return ElementTypes.GRASS;
    }

    @Override
    public int specialAttack() {
        return leafBlade();
    }

    @Override
    public int leafBlade() {
        Random random = new Random();
        int specialAttackPower = random.nextInt(10,20);
        System.out.println(specialAttackPower);
        return specialAttackPower;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        if (type == ElementTypes.WATER) {
            return true;
        } else {
        return false;
        }
    }
}
