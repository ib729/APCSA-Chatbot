import java.util.Scanner;

public class Wiki {
    public String menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String menuText = "\nAPCSA Wiki - Choose a topic (enter number):\n" +
                "1. Java Fundamentals\n" +
                "2. Object-Oriented Programming\n" +
                "3. Arrays and ArrayLists\n" +
                "4. Algorithms and Recursion\n" +
                "5. Classes and Inheritance\n" +
                "6. Common Exam Topics\n" +
                "0. Return to Main Menu\n";

        System.out.println(menuText);

        Scanner input = new Scanner(System.in);
        String menuSelection = input.nextLine();

        if (menuSelection.equals("1")) {
            return fundamentals();
        }
        else if (menuSelection.equals("2")) {
            return oop();
        }
        else if (menuSelection.equals("3")) {
            return arrays();
        }
        else if (menuSelection.equals("4")) {
            return algorithms();
        }
        else if (menuSelection.equals("5")) {
            return inheritance();
        }
        else if (menuSelection.equals("6")) {
            return examTopics();
        }
        else if (menuSelection.equals("0")) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            return "MAIN_MENU";
        }
        else {
            return "Invalid selection. Please try again.\n" + menuText;
        }
    }

    public String fundamentals() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return "\nJava Fundamentals:\n" +
                "1. Primitive Data Types (int, double, boolean, etc.)\n" +
                "2. Operators (+, -, *, /, %, ++, --)\n" +
                "3. String Methods and Concatenation\n" +
                "4. Type Casting and Conversion\n" +
                "5. Control Structures (if/else, switch)\n" +
                "6. Loops (for, while, do-while)\n" +
                "7. Methods and Parameters\n" +
                "8. Return Types and void\n";
    }

    public String oop() {
        return "\nObject-Oriented Programming:\n" +
                "1. Classes and Objects\n" +
                "2. Constructor Types\n" +
                "3. Instance Variables vs Local Variables\n" +
                "4. Access Modifiers (public, private)\n" +
                "5. Static vs Instance Methods\n" +
                "6. this Keyword\n" +
                "7. Method Overloading\n" +
                "8. Object References\n";
    }

    public String arrays() {
        return "\nArrays and ArrayLists:\n" +
                "1. Creating and Initializing Arrays\n" +
                "2. Accessing and Modifying Elements\n" +
                "3. Enhanced for Loop\n" +
                "4. Common Array Algorithms\n" +
                "5. 2D Arrays\n" +
                "6. ArrayList Methods\n" +
                "7. Wrapper Classes\n" +
                "8. ArrayList vs Array\n";
    }

    public String algorithms() {
        return "\nAlgorithms and Recursion:\n" +
                "1. Linear Search\n" +
                "2. Binary Search\n" +
                "3. Selection Sort\n" +
                "4. Insertion Sort\n" +
                "5. Recursion Basics\n" +
                "6. Recursive vs Iterative\n" +
                "7. Common Recursive Problems\n" +
                "8. Algorithm Efficiency\n";
    }

    public String inheritance() {
        return "\nClasses and Inheritance:\n" +
                "1. Superclass and Subclass\n" +
                "2. extends Keyword\n" +
                "3. Method Overriding\n" +
                "4. super Keyword\n" +
                "5. Abstract Classes\n" +
                "6. Interfaces\n" +
                "7. Polymorphism\n" +
                "8. Class Hierarchies\n";
    }

    public String examTopics() {
        return "\nCommon Exam Topics:\n" +
                "1. Free Response Question Strategies\n" +
                "2. Multiple Choice Tips\n" +
                "3. Common Pitfalls\n" +
                "4. Time Management\n" +
                "5. Practice Questions\n" +
                "6. Scoring Guidelines\n" +
                "7. Past Exam Analysis\n" +
                "8. Test-Taking Strategies\n";
    }

    public String getContent(int section, int topic) {
        return "Detailed content for Section " + section + ", Topic " + topic + " coming soon...";
    }
}