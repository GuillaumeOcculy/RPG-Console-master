package com.siu.interns.rpgconsole.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Character {

    private String name;
    private long hp;
    private long strenght;
    private long agility;

    public static Character createWarrior() {
        return new Character("Warrior", 800, 10, 10);
    }

    public static Character createBerserk() {
        return new Character("Berserk", 400, 20, 10);
    }

    public static Character createAssassin() {
        return new Character("Assassin", 600, 10, 30);
    }

    public Character(String name, long hp, long strenght, long agility) {
        this.name = name;
        this.hp = hp;
        this.strenght = strenght;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getStrenght() {
        return strenght;
    }

    public void setStrenght(long strenght) {
        this.strenght = strenght;
    }

    public long getAgility() {
        return agility;
    }

    public void setAgility(long agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
