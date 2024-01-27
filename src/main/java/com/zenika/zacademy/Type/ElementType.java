package com.zenika.zacademy.Type;

public interface ElementType {
    ElementTypes getType ();
    boolean isStrongerAgainstType(ElementTypes type);
    int specialAttack();
}