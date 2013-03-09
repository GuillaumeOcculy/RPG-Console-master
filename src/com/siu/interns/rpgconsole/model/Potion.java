package com.siu.interns.rpgconsole.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Potion extends Item {

    private long hp;
    private long strenght;
    private long agility;

    public static Potion createLifePotion() {
        return new Potion("Potion de vie", 80, 0, 0);
    }

    public static Potion createStrenghtPotion() {
        return new Potion("Potion de force", 0, 100, 0);
    }

    public static Potion createAgilityPotion() {
        return new Potion("Potion d\'agilité", 0, 0, 100);
    }

    public Potion(String name, long hp, long strenght, long agility) {
        super(name);
        this.hp = hp;
        this.strenght = strenght;
        this.agility = agility;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
}
