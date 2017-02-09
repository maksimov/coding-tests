package ctci.ds;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 08/02/2017
 */
public class MakingAnagrams2 {
    public static int numberNeeded(String a, String b) {
        int[] chars = new int['z'-'a'];
        a.chars().forEach(c -> chars[c-'a']++);
        b.chars().forEach(c -> chars[c-'a']--);
        return Arrays.stream(chars).map(Math::abs).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
