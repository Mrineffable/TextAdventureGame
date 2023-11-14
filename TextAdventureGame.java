import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest. Choose your path wisely.");

        // Start the adventure
        forestPath();
    }

    public static void forestPath() {
        System.out.println("\nYou are on a path in the forest. There's a fork in the road.");

        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            leftPath();
        } else {
            rightPath();
        }
    }

    public static void leftPath() {
        System.out.println("\nYou chose the left path. You encounter a friendly elf.");

        System.out.println("1. Chat with the elf.");
        System.out.println("2. Ignore the elf and continue.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println("\nThe elf gives you a magical potion. You feel stronger.");
            endGame("Congratulations! You completed the adventure!");
        } else {
            System.out.println("\nYou continue on the path and reach a dead-end. Game over!");
            endGame("Game over!");
        }
    }

    public static void rightPath() {
        System.out.println("\nYou chose the right path. You find a dark cave.");

        System.out.println("1. Enter the cave.");
        System.out.println("2. Stay outside and explore the surroundings.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println("\nInside the cave, you discover a treasure chest. You're rich!");
            endGame("Congratulations! You completed the adventure!");
        } else {
            System.out.println("\nWhile exploring outside, you fall into a pit. Game over!");
            endGame("Game over!");
        }
    }

    public static int getUserChoice(int maxChoice) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice < 1 || choice > maxChoice) {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid input. Please enter a number between 1 and " + maxChoice + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear the invalid input
            }
        }

        return choice;
    }

    public static void endGame(String message) {
        System.out.println("\n" + message);
        System.exit(0);
    }
}
