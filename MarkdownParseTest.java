import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileMD() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test-file.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        expectedResult = List.of("https://something.com", "some-thing.html");

        assertEquals(expectedResult, testResult);
    }
}
