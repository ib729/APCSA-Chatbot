import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Wiki wiki = new Wiki();
        Practice practice = new Practice();
        Search search = new Search();

        boolean running = true;
        while (running) {
            System.out.println("Welcome to the APCSA Study Guide!");
            System.out.println("Enter a command (w/p/s/help/quit):");
            String command = input.nextLine();

            if (command.equals("help") || command.equals("?")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("APCSA Study Guide - Commands:");
                System.out.println("  w - Wiki (Java concepts)");
                System.out.println("  p - Practice problems");
                System.out.println("  s - Search (type keywords to find info)");
                System.out.println("  help - Show this guide");
                System.out.println("  quit - Exit program");
            }
            else if (command.equals("quit") || command.equals("q")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Thanks for studying! Goodbye!");
                running = false;
            }
            else if (command.equals("w")) {
                String result = wiki.menu();
                if (!result.equals("MAIN_MENU")) {
                    System.out.println(result);
                    System.out.println("\nPress Enter to continue...");
                    input.nextLine();
                }
            }
            else if (command.equals("p")) {
                String result = practice.menu();
                if (!result.equals("MAIN_MENU")) {
                    System.out.println(result);
                    System.out.println("\nPress Enter to continue...");
                    input.nextLine();
                }
            }
            else if (command.equals("s")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Search Mode - Type keywords to find information (or 'exit' to return):");
                while (true) {
                    System.out.print("\nSearch: ");
                    String query = input.nextLine();

                    if (query.equals("exit")) {
                        break;
                    }

                    String result = search.processQuery(query);
                    System.out.println(result);
                }
            }
            else {
                System.out.println("Invalid command. Type 'help' to see available commands.");
            }
        }
        input.close();
    }
}