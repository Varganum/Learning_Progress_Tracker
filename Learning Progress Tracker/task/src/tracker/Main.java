package tracker;

import java.util.Scanner;

public class Main {

    private static final String[] MESSAGES = {
            "Learning Progress Tracker",
            "No input",
            "Error: unknown command!",
            "Bye!"
    };

    private static final String[] COMMANDS = {
            "exit"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder userInput = new StringBuilder();

        System.out.println(MESSAGES[0]);

        do {
            userInput.setLength(0);
            userInput.append(scanner.nextLine());
            if (userInput.toString().isBlank()) {userInput.setLength(0);}

            switch (userInput.toString()) {
                case "exit" -> System.out.println(MESSAGES[3]);
                case "" -> System.out.println(MESSAGES[1]);
                default -> System.out.println(MESSAGES[2]);
            }

        } while (!userInput.toString().equals(COMMANDS[0]));

    }
}
