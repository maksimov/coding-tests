package ctci.ds;

import java.util.Scanner;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 08/02/2017
 */
public class MakingAnagrams {
    public static int numberNeeded(String a, String b) {
        int deletions = 0;
        for(char c='a';c<='z'; c++) {
            int inA = 0;
            int inB = 0;
            int pos = 0;
            while(true) {
                pos = a.indexOf(c, pos);
                if( pos < 0 ) break;
                pos++;
                inA++;
            }
            pos = 0;
            while(true) {
                pos = b.indexOf(c, pos);
                if( pos < 0 ) break;
                pos++;
                inB++;
            }
            deletions += Math.abs(inA-inB);
        }
        return deletions;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
