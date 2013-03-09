package com.siu.interns.rpgconsole.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.lang.*;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Player {

    private String name;
    private Character character;
    private Weapon weapon;
    private Item item1;
    private Item item2;

    public Player(String name, Character character, Weapon weapon, Item item1, Item item2) {
        this.name = name;
        this.character = character;
        this.weapon = weapon;
        this.item1 = item1;
        this.item2 = item2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Item getItem1() {
        return item1;
    }

    public void setItem1(Item item1) {
        this.item1 = item1;
    }

    public Item getItem2() {
        return item2;
    }

    public void setItem2(Item item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
