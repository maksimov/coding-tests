package ctci.ds;

import ctci.ds.Contacts;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 09/02/2017
 */
public class ContactsTest {
    @Test
    public void testCase3() throws IOException, URISyntaxException {
        InputStream is = new BufferedInputStream(Files.newInputStream(Paths.get(this.getClass().getResource("/ctci/ds/tc3-input.txt").toURI())));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setIn(is);
        System.setOut(new PrintStream(os));
        long time = System.currentTimeMillis();
        Contacts.main(new String[0]);
        time = (System.currentTimeMillis() - time) / 1000;
        String expected = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("/ctci/ds/tc3-output.txt").toURI())));
        String actual = os.toString("UTF-8");
        assertEquals(expected, actual);
        assertTrue("Test should take less than 10 seconds not " + time, time < 10);

    }
}
