package com.siu.interns.rpgconsole.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Weapon {

    private String name;
    private long damages;
    private long defense;
    private long weight;

    public static Weapon createTwoHandedSword() {
        return new Weapon("Two handed sword", 30, 10, 50);
    }

    public static Weapon createOneHandedSwordAndShield() {
        return new Weapon("One handed sword and shield", 15, 20, 50);
    }

    public static Weapon createDagger() {
        return new Weapon("Double dagger", 10, 5, 5);
    }

    public Weapon(String name, long damages, long defense, long weight) {
        this.name= name;
        this.damages = damages;
        this.defense = defense;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDamages() {
        return damages;
    }

    public void setDamages(long damages) {
        this.damages = damages;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}
