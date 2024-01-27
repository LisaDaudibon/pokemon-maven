package com.zenika.zacademy.Pokemon;

import com.zenika.zacademy.Type.ElementTypes;
import com.zenika.zacademy.Type.Fire;

import java.util.Random;

public class Charmander extends Pokemon implements Fire {
    public static final int POKEDEX_INDEX = 4;

    public Charmander () {
        super();
    }

    public Charmander (int level) {
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
        System.out.println("Charmander");
    }
    @Override
    public ElementTypes getType() {
        return ElementTypes.FIRE;
    }

    @Override
    public int specialAttack() {
        return flame();
    }

    @Override
    public int flame() {
        Random random = new Random();
        int specialAttackPower = random.nextInt(10,20);
        return specialAttackPower;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        if (type == ElementTypes.GRASS) {
            return true;
        } else {
            return false;
        }
    }
}
