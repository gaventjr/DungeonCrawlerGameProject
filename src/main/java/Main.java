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
    }

}
