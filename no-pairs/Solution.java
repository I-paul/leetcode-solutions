import java.util.*;

class Solution {

    public static List<Integer> minimalOperations(List<String> words) {
        List<Integer> result = new ArrayList<>();

        for (String word : words) {
            int operations = 0;

            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i - 1)) {
                    operations++;
                    i++;    // Skip next character since this pair is fixed
                }
            }

            result.add(operations);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        List<Integer> operations = minimalOperations(words);
        for (int op : operations) {
            System.out.println(op);
        }
        scanner.close();
    }
}
