import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lowercase
        str1 = s1.replaceAll("\\s", "").toLowerCase();
        str2 = s2.replaceAll("\\s", "").toLowerCase();
        
        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        
        // Compare sorted arrays
        return Arrays.equals(charArr1, charArr2);
    }

    public static void checkAnagram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
        scanner.close();
        
        if (areAnagrams(s1, s2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }

    public static void main(String[] args) {
        checkAnagram();
    }
}
