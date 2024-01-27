package com.zenika.zacademy;

import com.zenika.zacademy.Pokemon.Bulbasaur;
import com.zenika.zacademy.Pokemon.Charmander;
import com.zenika.zacademy.Pokemon.Pokemon;
import com.zenika.zacademy.Pokemon.Squirtle;

import static com.zenika.zacademy.Color.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon flameche = new Charmander();
        Pokemon max = new Squirtle(6);
        Pokemon violette = new Bulbasaur(10);

        System.out.println(max);

        flameche.attack();
        max.attack();
        violette.attack();

        System.out.println(flameche);
        System.out.println(max);
        System.out.println(violette);

        ((Charmander) flameche).specialAttack();
        ((Bulbasaur) violette).leafBlade();
    }
}