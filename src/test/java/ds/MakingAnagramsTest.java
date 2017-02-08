package ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 08/02/2017
 */
public class MakingAnagramsTest {
    @Test
    public void SimpleTest() {
        assertEquals(1, MakingAnagrams.numberNeeded("abcd", "abc"));
        assertEquals(3, MakingAnagrams.numberNeeded("abcd", "ccabc"));
        assertEquals(40, MakingAnagrams2.numberNeeded("abcdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd" +
                "asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdad",
                "ccabcdsasdasdadsawdasdwasdasdasdasdasdasdadqsdqdsfaxdasdqfasdasdfasda" +
                "sdqwdasdasfqwdasdsasdqsdfasdasdqfasdasdasdqwsdasdasdsadasd"));
    }

    @Test
    public void Java8Test() {
        assertEquals(1, MakingAnagrams2.numberNeeded("abcd", "abc"));
        assertEquals(3, MakingAnagrams2.numberNeeded("abcd", "ccabc"));
        assertEquals(40, MakingAnagrams2.numberNeeded("abcdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd" +
                        "asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdad",
                "ccabcdsasdasdadsawdasdwasdasdasdasdasdasdadqsdqdsfaxdasdqfasdasdfasda" +
                        "sdqwdasdasfqwdasdsasdqsdfasdasdqfasdasdasdqwsdasdasdsadasd"));
    }

}
