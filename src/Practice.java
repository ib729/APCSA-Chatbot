import java.util.Scanner;

public class Practice {
    public String menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String menuText = "\nAPCSA Practice Problems - Choose a topic:\n" +
                "1. Variables and Data Types\n" +
                "2. Conditionals\n" +
                "3. Loops\n" +
                "4. String Methods\n" +
                "0. Return to Main Menu\n";

        System.out.println(menuText);

        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();

        if (selection.equals("1")) {
            return variablesPractice();
        }
        else if (selection.equals("2")) {
            return conditionalsPractice();
        }
        else if (selection.equals("3")) {
            return loopsPractice();
        }
        else if (selection.equals("4")) {
            return stringPractice();
        }
        else if (selection.equals("0")) {
            return "MAIN_MENU";
        }
        else {
            return "Invalid selection. Please try again.\n" + menuText;
        }
    }

    public String variablesPractice() {
        return "\nVariables Practice:\n" +
                "Q1: What will be printed?\n" +
                "   int x = 5;\n" +
                "   int y = 2;\n" +
                "   System.out.println(x / y);\n\n" +
                "A: 2 (integer division)\n\n" +
                "Q2: What will be stored in result?\n" +
                "   double result = 7 + 3 / 2;\n\n" +
                "A: 8.0 (order of operations)\n";
    }

    public String conditionalsPractice() {
        return "\nConditionals Practice:\n" +
                "Q1: What will be printed?\n" +
                "   int score = 85;\n" +
                "   if (score >= 90) {\n" +
                "       System.out.println(\"A\");\n" +
                "   } else if (score >= 80) {\n" +
                "       System.out.println(\"B\");\n" +
                "   }\n\n" +
                "A: B\n";
    }

    public String loopsPractice() {
        return "\nLoops Practice:\n" +
                "Q1: How many times will this loop run?\n" +
                "   for (int i = 0; i < 5; i += 2) {\n" +
                "       System.out.println(i);\n" +
                "   }\n\n" +
                "A: 3 times (prints 0, 2, 4)\n";
    }

    public String stringPractice() {
        return "\nString Methods Practice:\n" +
                "Q1: What is the output?\n" +
                "   String str = \"Hello\";\n" +
                "   System.out.println(str.substring(1, 4));\n\n" +
                "A: ell\n";
    }
}