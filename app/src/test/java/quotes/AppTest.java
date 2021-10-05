/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testFileReader() {
        String path = "./src/test/resources/recentquotes.json";
        List allQuotes = App.getQuote(path);
        ArrayList<String> saveQuotes = new ArrayList<>();
        for (Object i : allQuotes) {
            saveQuotes.add(i.toString());
        }
        assertEquals( true , saveQuotes.contains("{author: Cassandra Clare, text:  “Have you fallen in love with the wrong person yet?'}") );
        assertEquals( true , saveQuotes.contains("{author: Mark Lawrence, text:  “A Dark time comes. }") );
        assertEquals( false , saveQuotes.contains("{author:  W. Purkey, text: nobody watching}") );
        assertEquals( true , saveQuotes.contains("{author: William W. Purkey, text:  “You've gotta dance like there's nobody watching}") );
    }
}