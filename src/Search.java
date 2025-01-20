import java.util.Scanner;

public class Search {
    public String processQuery(String query) {
        // Convert query to lowercase for case-insensitive matching
        query = query.toLowerCase();

        // Variables and Data Types
        if (query.contains("int") || query.contains("double") || query.contains("variable")) {
            return "\nVariables and Data Types:\n" +
                    "- int: Whole numbers (-2147483648 to 2147483647)\n" +
                    "- double: Decimal numbers\n" +
                    "- boolean: true/false values\n" +
                    "- char: Single characters\n" +
                    "Example:\n" +
                    "   int age = 15;\n" +
                    "   double gpa = 3.8;\n";
        }

        // Loops
        if (query.contains("loop") || query.contains("for") || query.contains("while")) {
            return "\nLoops in Java:\n" +
                    "1. For Loop:\n" +
                    "   for (int i = 0; i < 5; i++) {\n" +
                    "       System.out.println(i);\n" +
                    "   }\n\n" +
                    "2. While Loop:\n" +
                    "   int count = 0;\n" +
                    "   while (count < 5) {\n" +
                    "       System.out.println(count);\n" +
                    "       count++;\n" +
                    "   }\n";
        }

        // If statements and conditionals
        if (query.contains("if") || query.contains("else") || query.contains("condition")) {
            return "\nConditional Statements:\n" +
                    "if (condition) {\n" +
                    "    // code\n" +
                    "} else if (another condition) {\n" +
                    "    // code\n" +
                    "} else {\n" +
                    "    // code\n" +
                    "}\n\n" +
                    "Comparison Operators:\n" +
                    "==  equal to\n" +
                    "!=  not equal to\n" +
                    ">   greater than\n" +
                    "<   less than\n" +
                    ">=  greater than or equal to\n" +
                    "<=  less than or equal to\n";
        }

        // String methods
        if (query.contains("string") || query.contains("text") || query.contains("substring")) {
            return "\nString Methods:\n" +
                    "- length(): get string length\n" +
                    "- substring(start, end): get part of string\n" +
                    "- equals(): compare strings\n" +
                    "- indexOf(): find position of character\n" +
                    "Example:\n" +
                    "   String text = \"Hello World\";\n" +
                    "   int length = text.length();  // 11\n" +
                    "   String part = text.substring(0, 5);  // \"Hello\"\n";
        }

        // Math operations
        if (query.contains("math") || query.contains("calculation") || query.contains("operator")) {
            return "\nMath Operations:\n" +
                    "+ addition\n" +
                    "- subtraction\n" +
                    "* multiplication\n" +
                    "/ division\n" +
                    "% modulus (remainder)\n\n" +
                    "Math Class Methods:\n" +
                    "Math.pow(base, exponent) - power\n" +
                    "Math.sqrt(number) - square root\n" +
                    "Math.abs(number) - absolute value\n" +
                    "Math.random() - random number between 0 and 1\n";
        }

        // Arrays
        if (query.contains("array") || query.contains("list")) {
            return "\nArrays:\n" +
                    "Declaration and Creation:\n" +
                    "   int[] numbers = new int[5];\n" +
                    "   int[] scores = {90, 85, 95, 88, 92};\n\n" +
                    "Accessing Elements:\n" +
                    "   int firstNumber = numbers[0];\n" +
                    "   numbers[1] = 42;\n\n" +
                    "Common Operations:\n" +
                    "- array.length to get size\n" +
                    "- Loop through array using for loop\n";
        }

        // Scanner and input
        if (query.contains("input") || query.contains("scanner") || query.contains("read")) {
            return "\nScanner and Input:\n" +
                    "Scanner input = new Scanner(System.in);\n\n" +
                    "Methods:\n" +
                    "nextInt() - read integer\n" +
                    "nextDouble() - read decimal\n" +
                    "nextLine() - read string\n" +
                    "next() - read word\n\n" +
                    "Example:\n" +
                    "   String name = input.nextLine();\n" +
                    "   int age = input.nextInt();\n";
        }

        // Default response if no keywords match
        return "No matching content found. Try using keywords like:\n" +
                "- variable, int, double\n" +
                "- loop, for, while\n" +
                "- if, condition\n" +
                "- string, text\n" +
                "- math, calculation\n" +
                "- array, list\n" +
                "- input, scanner\n";
    }
}