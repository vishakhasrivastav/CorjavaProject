package stringPrograms;

import java.util.Arrays;

public class SplitDemo2 {

	public static void main(String[] args) {
		/*
		 * String s="Anudip Foundation NGO"
Print pattern:-

NGO Foundation Anudip
Foundation Anudip
Anudip
		 */

		String s = "Anudip Foundation NGO";
        int start = 0;
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                for (int i = end + 1; i <= start; i++) {
                    System.out.print(s.charAt(i));
                }
                System.out.print(" ");
                start = end;
            }
            end--;
        }

        // Print the first word
        for (int i = 0; i <= start; i++) {
            System.out.print(s.charAt(i));
        }

	}

}
