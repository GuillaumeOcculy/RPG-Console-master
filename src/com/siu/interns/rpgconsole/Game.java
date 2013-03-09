package com.siu.interns.rpgconsole;

import com.siu.interns.rpgconsole.model.*;
import com.siu.interns.rpgconsole.model.Character;

import java.util.Scanner;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class Game {

    private Player player1;
    private Player player2;

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("RPG Console");
        System.out.println("====================\n");

        // initialier les players avec un character, une arme, 2 items

        System.out.println("Création du player 1 :");
        player1 = createPlayer();
        System.out.println();

        System.out.println("Création du player 2 :");
        player2 = createPlayer();
        System.out.println();

        System.out.println(player1);
        System.out.println(player2);
    }

    public Player createPlayer() {
        String name = "";
        while (name.trim().isEmpty()) {
            System.out.print("Nom du joueur : ");
            name = scanner.next();
            System.out.println();
        }

        Character character = null;

        System.out.println("Classe du joueur :");
        System.out.println("\t1 - Warrior");
        System.out.println("\t2 - Berserk");
        System.out.println("\t3 - Assassin\n");

        while (null == character) {
            switch (getPlayerChoice()) {
                case 1:
                    character = Character.createWarrior();
                    break;
                case 2:
                    character = Character.createBerserk();
                    break;
                case 3:
                    character = Character.createAssassin();
                    break;
                default:
                    System.out.println("Le choix ne fait pas partie de la liste");
            }
        }

        Weapon weapon = null;

        System.out.println("Arme du joueur :");
        System.out.println("\t1 - Epée à 2 mains");
        System.out.println("\t2 - Epée à 1 main + bouclier");
        System.out.println("\t3 - Double dague\n");

        while (null == weapon) {
            switch (getPlayerChoice()) {
                case 1:
                    weapon = Weapon.createTwoHandedSword();
                    break;
                case 2:
                    weapon = Weapon.createOneHandedSwordAndShield();
                    break;
                case 3:
                    weapon = Weapon.createDagger();
                    break;
                default:
                    System.out.println("Le choix ne fait pas partie de la liste");
            }
        }

        Item item1 = getPlayerItem(1);
        Item item2 = getPlayerItem(2);

        return new Player(name, character, weapon, item1, item2);
    }

    private int getPlayerChoice() {
        System.out.print("Entrez le numéro correspondant : ");

        try {
            return Integer.valueOf(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Vous devez renseigner un chiffre");
            return 0;
        }
    }

    private Item getPlayerItem(int number) {
        Item item = null;

        System.out.println("Item " + number + " du joueur :");
        System.out.println("\t1 - Potion de vie");
        System.out.println("\t2 - Potion de force");
        System.out.println("\t3 - Potion d\'agilité");
        System.out.println("\t4 - Flash\n");

        while (null == item) {
            switch (getPlayerChoice()) {
                case 1:
                    item = Potion.createLifePotion();
                    break;
                case 2:
                    item = Potion.createStrenghtPotion();
                    break;
                case 3:
                    item = Potion.createAgilityPotion();
                    break;
                case 4:
                    System.out.println("TODO flash"); // pas encore implementé
                    break;
                default:
                    System.out.println("Le choix ne fait pas partie de la liste");
            }
        }

        return item;
    }
}
