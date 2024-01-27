package com.zenika.zacademy.Pokemon;

import com.zenika.zacademy.Type.ElementType;
import com.zenika.zacademy.Color;

import java.util.Random;

import static com.zenika.zacademy.Color.*;

public abstract class Pokemon implements ElementType {

    private int level;
    private int pv;

    public Pokemon () {
        this(1);
    }
    public Pokemon (int level) {
        this.level = level;
        this.pv = level * 5 ;
    }

    @Override
    public String toString() {
//
        return String.format("%s%s%s%s de niveau %s et avec %s PV .", GREEN_BACKGROUND_BRIGHT.getCode(), BLACK_TEXT.getCode(), this.getClass().getSimpleName(), RESET.getCode(), level, pv);
    }

    public int attack () {
        Random random = new Random();
        int attackPower = random.nextInt(10);

        String attackMessage = attackPower > 0 ?
                String.format(" Pokémon %s attaque une intensité de %s", this.getClass().getSimpleName(), attackPower) :
                String.format(" Pokémon %s a raté son attaque.", this.getClass().getSimpleName());
        return attackPower;
    }

    public abstract void shout();


}
