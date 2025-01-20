public class Search {
    public String processQuery(String query) {
        query = query.toLowerCase();
        String result = "";

        // Variables and Types
        if (hasWord(query, "variable", "type", "int", "double", "boolean")) {
            result += "\nVARIABLES AND TYPES\n";
            result += "Variables are like containers that store information in your program.\n\n";
            result += "Main types of variables:\n";
            result += "1. int - whole numbers (like 5, -3, 42)\n";
            result += "   Example: int age = 15;\n\n";
            result += "2. double - decimal numbers (like 3.14, -2.5)\n";
            result += "   Example: double price = 19.99;\n\n";
            result += "3. boolean - true/false values\n";
            result += "   Example: boolean isHappy = true;\n\n";
            result += "4. char - single characters (like 'A', '7', '!')\n";
            result += "   Example: char grade = 'A';\n\n";
            result += "5. String - text (like \"Hello\")\n";
            result += "   Example: String name = \"John\";\n\n";
            result += "Remember: \n";
            result += "- Variables must be declared with a type\n";
            result += "- Names can't start with numbers\n";
            result += "- Use meaningful names for your variables\n";
        }

        // Print Statements
        if (hasWord(query, "print", "output", "display")) {
            result += "\nPRINT STATEMENTS\n";
            result += "Print statements show text or values on the screen.\n\n";
            result += "Ways to print:\n";
            result += "1. Print with newline (most common):\n";
            result += "   System.out.println(\"Hello!\");\n\n";
            result += "2. Print without newline:\n";
            result += "   System.out.print(\"Hello \");\n\n";
            result += "You can print:\n";
            result += "- Text: System.out.println(\"Hi there\");\n";
            result += "- Variables: System.out.println(score);\n";
            result += "- Math: System.out.println(2 + 2);\n";
            result += "- Multiple things: System.out.println(\"Score: \" + score);\n";
        }

        // If Statements
        if (hasWord(query, "if", "else", "condition")) {
            result += "\nIF STATEMENTS\n";
            result += "If statements let your program make decisions.\n\n";
            result += "Basic if statement:\n";
            result += "if (score >= 90) {\n";
            result += "    System.out.println(\"Great job!\");\n";
            result += "}\n\n";
            result += "If-else statement:\n";
            result += "if (age >= 16) {\n";
            result += "    System.out.println(\"Can drive\");\n";
            result += "} else {\n";
            result += "    System.out.println(\"Too young\");\n";
            result += "}\n\n";
            result += "Comparison operators:\n";
            result += "==  equal to\n";
            result += "!=  not equal to\n";
            result += ">   greater than\n";
            result += "<   less than\n";
            result += ">=  greater than or equal to\n";
            result += "<=  less than or equal to\n";
        }

        // Loops
        if (hasWord(query, "loop", "while", "for")) {
            result += "\nLOOPS\n";
            result += "Loops let you repeat code multiple times.\n\n";
            result += "1. While Loop:\n";
            result += "- Repeats while a condition is true\n";
            result += "Example (counts from 1 to 5):\n";
            result += "int count = 1;\n";
            result += "while (count <= 5) {\n";
            result += "    System.out.println(count);\n";
            result += "    count = count + 1;\n";
            result += "}\n\n";
            result += "2. For Loop:\n";
            result += "- Used when you know how many times to repeat\n";
            result += "Example (also counts from 1 to 5):\n";
            result += "for (int i = 1; i <= 5; i++) {\n";
            result += "    System.out.println(i);\n";
            result += "}\n";
        }

        // Arrays
        if (hasWord(query, "array", "arrays")) {
            result += "\nARRAYS\n";
            result += "Arrays store multiple values in a single variable.\n\n";
            result += "Creating arrays:\n";
            result += "1. Empty array:\n";
            result += "   int[] numbers = new int[5];  // Makes room for 5 numbers\n\n";
            result += "2. Array with values:\n";
            result += "   int[] scores = {95, 88, 92, 85};\n\n";
            result += "Using arrays:\n";
            result += "- Get a value: scores[0]  // First value\n";
            result += "- Change a value: scores[1] = 90;  // Change second value\n";
            result += "- Array length: scores.length\n\n";
            result += "Remember:\n";
            result += "- Arrays start at position 0\n";
            result += "- Can't change array size after creating it\n";
        }

        // Methods
        if (hasWord(query, "method", "function")) {
            result += "\nMETHODS\n";
            result += "Methods are reusable blocks of code that perform specific tasks.\n\n";
            result += "Basic method:\n";
            result += "public static void sayHello() {\n";
            result += "    System.out.println(\"Hello!\");\n";
            result += "}\n\n";
            result += "Method with parameters:\n";
            result += "public static void greet(String name) {\n";
            result += "    System.out.println(\"Hello, \" + name);\n";
            result += "}\n\n";
            result += "Method that returns a value:\n";
            result += "public static int add(int a, int b) {\n";
            result += "    return a + b;\n";
            result += "}\n";
        }

        // Classes
        if (hasWord(query, "class", "object")) {
            result += "\nCLASSES\n";
            result += "Classes are like blueprints for creating objects.\n\n";
            result += "Simple class example:\n";
            result += "public class Student {\n";
            result += "    // Variables for student info\n";
            result += "    String name;\n";
            result += "    int grade;\n\n";
            result += "    // Constructor to create new student\n";
            result += "    public Student(String n, int g) {\n";
            result += "        name = n;\n";
            result += "        grade = g;\n";
            result += "    }\n\n";
            result += "    // Method to print student info\n";
            result += "    public void printInfo() {\n";
            result += "        System.out.println(name + \": \" + grade);\n";
            result += "    }\n";
            result += "}\n";
        }

        // Strings
        if (hasWord(query, "string", "text")) {
            result += "\nSTRINGS\n";
            result += "Strings store text (words, sentences, etc).\n\n";
            result += "Creating Strings:\n";
            result += "String name = \"Alice\";\n\n";
            result += "Useful String methods:\n";
            result += "1. length() - counts characters\n";
            result += "   name.length()  // 5\n\n";
            result += "2. toUpperCase() - makes all letters capital\n";
            result += "   name.toUpperCase()  // \"ALICE\"\n\n";
            result += "3. toLowerCase() - makes all letters lowercase\n";
            result += "   name.toLowerCase()  // \"alice\"\n\n";
            result += "4. equals() - compare two strings\n";
            result += "   name.equals(\"Bob\")  // false\n";
        }

        // Math
        if (hasWord(query, "math", "calculation", "operator")) {
            result += "\nMATH OPERATIONS\n";
            result += "Basic math operators:\n";
            result += "+ addition: 5 + 3 = 8\n";
            result += "- subtraction: 5 - 3 = 2\n";
            result += "* multiplication: 5 * 3 = 15\n";
            result += "/ division: 5 / 2 = 2 (with ints)\n";
            result += "            5.0 / 2 = 2.5 (with doubles)\n\n";
            result += "Math shortcuts:\n";
            result += "count = count + 1;  // Same as: count++;\n";
            result += "x = x + 5;  // Same as: x += 5;\n\n";
            result += "Math class methods:\n";
            result += "Math.max(5, 3)  // Returns larger number (5)\n";
            result += "Math.min(5, 3)  // Returns smaller number (3)\n";
            result += "Math.abs(-5)    // Returns positive value (5)\n";
        }

        if (result.equals("")) {
            result = "\nTry searching for:\n";
            result += "- variables or types\n";
            result += "- print or output\n";
            result += "- if statements\n";
            result += "- loops\n";
            result += "- arrays\n";
            result += "- methods\n";
            result += "- classes\n";
            result += "- strings\n";
            result += "- math\n\n";
            result += "Or type 'topics' to see everything!\n";
        }

        return result;
    }

    private boolean hasWord(String text, String... words) {
        for (String word : words) {
            if (text.contains(word)) {
                return true;
            }
        }
        return false;
    }
}