package ctci.ds;

import java.util.*;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 09/02/2017
 */
public class Contacts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Character, List<String>> alphaBlocks = new HashMap<>();
        for(char c = 'a'; c <= 'z'; c++) {
            alphaBlocks.put(c, new ArrayList<>());
        }
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                alphaBlocks.get(contact.charAt(0)).add(contact);
            } else if( op.equals("find")) {
                System.out.println(alphaBlocks.get(contact.charAt(0))
                        .stream()
                        .filter(s -> s.startsWith(contact))
                        .count());
           }
        }
    }
}
