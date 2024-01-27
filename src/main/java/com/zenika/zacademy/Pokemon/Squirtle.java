package com.zenika.zacademy.Pokemon;

import com.zenika.zacademy.Type.ElementTypes;
import com.zenika.zacademy.Type.Water;

import java.util.Random;

public class Squirtle extends Pokemon implements Water {
    public static final int POKEDEX_INDEX = 7;
    public Squirtle () {
        super();
    }

    public Squirtle (int level) {
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
        System.out.println("Squirtle");
    }

    public void surf() {
        System.out.println("Squirtle se met à nager.");
    }

    @Override
    public ElementTypes getType() {
        return ElementTypes.WATER;
    }

    @Override
    public int specialAttack() {
       return waterGun();
    }

    @Override
    public int waterGun() {
        Random random = new Random();
        int specialAttackPower = random.nextInt(10,20);
        return specialAttackPower;
    }

    @Override
    public boolean isStrongerAgainstType(ElementTypes type) {
        if (type == ElementTypes.FIRE) {
            return true;
        } else {
            return false;
        }
    }
}
