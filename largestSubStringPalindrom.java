import java.util.Scanner;

public class largestSubStringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string:");
        String s = sc.nextLine();
        System.out.println("The length of the largest substring of 1s after swapping one 0 with a 1 is: " + findMaxConsecutiveOnesAfterSwap(s));
        sc.close();
    }

    public static int findMaxConsecutiveOnesAfterSwap(String s) {
        int n = s.length();
        int maxCount = 0;

        // Loop through each position to check if it's a '0'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                // Try swapping this '0' with every '1'
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == '1') {
                        // Create a new string with '1' and '0' swapped
                        StringBuilder newStr = new StringBuilder(s);
                        newStr.setCharAt(i, '1');
                        newStr.setCharAt(j, '0');

                        maxCount = Math.max(maxCount, longestConsecutiveOnes(newStr.toString()));
                    }
                }
            }
        }

        // Also consider the case where no swaps are needed
        maxCount = Math.max(maxCount, longestConsecutiveOnes(s));

        return maxCount;
    }

    private static int longestConsecutiveOnes(String s) {
        int maxLen = 0;
        int currentLen = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }

        return maxLen;
    }
}
