package codingque;

public class StringCombinations {

    // Method to print all permutations of a given string
    public static void printPermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermutations(remaining, ans + ch);
        }
    }

    // Method to generate and print all combinations of a given string
    public static void printCombinations(String str, String ans, int index) {
        if (!ans.isEmpty()) {
            System.out.println(ans);
        }
        for (int i = index; i < str.length(); i++) {
            printCombinations(str, ans + str.charAt(i), i + 1);
        }
    }

    public static void main(String[] args) {
        String input = "WXYZ";
        System.out.println("Permutations:");
        printPermutations(input, "");

        System.out.println("\nCombinations:");
        printCombinations(input, "", 0);
    }

}
