package ip;

public class LevenshteinDistance {
    public static void main(String[] args) {
        System.out.println(levenshteinDistance("abc", "abd"));

    }

    public static int levenshteinDistance(String str1, String str2) {
        String small = str1.length() < str2.length() ? str1 : str2;
        String big = str1.length() >= str2.length() ? str1 : str2;

        int[] evenEdits = new int[small.length() + 1];
        int[] oddEdits = new int[small.length() + 1];

        for (int i = 0; i < small.length() + 1; i++) {
            evenEdits[i] = i;
        }

        int currEd[];
        int prevEd[];
        for (int i = 1; i < big.length() + 1; i++) {
            if (i % 2 == 0) {
                currEd = evenEdits;
                prevEd = oddEdits;
            } else {
                currEd = oddEdits;
                prevEd = evenEdits;
            }
            currEd[0] = i;
            for (int j = 1; j < small.length() + 1; j++) {
                if (big.charAt(i - 1) == small.charAt(j - 1)) {
                    currEd[j] = prevEd[j - 1];
                } else {
                    currEd[j] = 1 +
                            Math.min(prevEd[j - 1], Math.min(prevEd[j], currEd[j - 1]));
                }
            }
        }


        return big.length() % 2 == 0 ? evenEdits[small.length()] : oddEdits[small.length()];
    }
}
