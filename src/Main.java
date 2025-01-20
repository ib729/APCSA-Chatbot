import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Search search = new Search();
        boolean running = true;

        while (running) {
            System.out.println("Prp");
            System.out.println("A simple Java study guide.");
            System.out.println("Commands: help, topics, quit");
            System.out.print("\nSearch: ");

            String query = input.nextLine();

            if (query.equals("quit") || query.equals("q")) {
                System.out.println("Thanks for studying!");
                running = false;
            }
            else if (query.equals("help") || query.equals("?")) {
                System.out.println("\nHow to use this guide:");
                System.out.println("- Just type what you want to learn about");
                System.out.println("- For example: variables, loops, if statements");
                System.out.println("- Type 'topics' to see everything you can learn");
            }
            else if (query.equals("topics")) {
                System.out.println("\nTopics you can learn about:");
                System.out.println("1. Variables and Types");
                System.out.println("2. Print Statements");
                System.out.println("3. If Statements");
                System.out.println("4. Loops");
                System.out.println("5. Arrays");
                System.out.println("6. Methods");
                System.out.println("7. Classes");
                System.out.println("8. Strings");
                System.out.println("9. Math Operations");
            }
            else {
                String result = search.processQuery(query);
                System.out.println(result);
            }

            System.out.println("\nPress Enter to continue...");
            input.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        input.close();
    }
}
