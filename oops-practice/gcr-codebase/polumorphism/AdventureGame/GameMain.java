package AdventureGame;

import java.util.Scanner;

public class GameMain {

    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("\n===== BATTLE STARTED =====\n");

        for (GameCharacter character : characters) {

            character.performAttack();      // Dynamic Method Dispatch

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\n===== PARTICIPANTS =====");

        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages : " + mageCount);
        System.out.println("Archers : " + archerCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameCharacter[] characters = new GameCharacter[3];

        System.out.print("Enter Warrior Name : ");
        characters[0] = new Warrior(sc.nextLine());

        System.out.print("Enter Mage Name : ");
        characters[1] = new Mage(sc.nextLine());

        System.out.print("Enter Archer Name : ");
        characters[2] = new Archer(sc.nextLine());

        startBattle(characters);

        sc.close();
    }
}