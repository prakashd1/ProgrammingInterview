package ip;
//This is hackerrank dynamic programming question
public class Abbreviation {
    public static void main(String[] args) {
        System.out.println(abbreviation("daBcd", "ABC"));
    }

    static String abbreviation(String a, String b) {
        int ap = 0;
        for (int i = 0; i < b.length(); i++) {
            if (ap >= a.length()) return "NO";

            Character bc = b.charAt(i);
            Character ac = a.charAt(ap);
            if (bc.equals(ac)) {
                ap++;
                continue;
            }
            ac = Character.toUpperCase(ac);
            if (ac.equals(bc)) {
                ap++;
                continue;
            }
        }
        return "YES";
    }
}
