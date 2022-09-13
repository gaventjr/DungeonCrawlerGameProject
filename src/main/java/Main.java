import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game variables

        String [] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamaage = 25;

        //Player variables
        int health = 100;
        int attackDamage =50;
        int numHealthPotions = 3;
        int healthPotionHealAmount= 25;
        int healthPotionDropChancePercentage =40;

        boolean running = true;

        System.out.println("Welcome to the Dungeon! We go fun and games!");

        GAME:// name of while loop
        while(running) {
            System.out.println("-------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];// accessing the array
            System.out.println("\t# " + enemy + "has appeared! $\n");// /n is like a line break to move to the next line

            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);// /t is tab
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");
            }
        }
    }

}
