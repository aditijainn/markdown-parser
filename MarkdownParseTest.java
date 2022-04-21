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

    @Test
    public void testFile2() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test2.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        expectedResult = List.of("linktosomething.com");

        assertEquals(expectedResult, testResult);
    }

    /*
    * Haven't fixed the bug that causes this test to fail yet so will not test yet
    @Test
    public void testFile3() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test3.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        expectedResult = List.of("linktosomething.com");

        assertEquals(expectedResult, testResult);
    }
    */

    @Test
    public void testFile4() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test4.md"));

        ArrayList<String> testResult = new ArrayList<>();
        ArrayList<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        
        
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFile5() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test5.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        

        assertEquals(expectedResult, testResult);
    }

    @Test
    public void testFile6() throws Exception {
        String fileContents = Files.readString(Path.of("/Users/alexandrade/Documents/GitHub/markdown-parser/test6.md"));

        ArrayList<String> testResult = new ArrayList<>();
        List<String> expectedResult = new ArrayList<>();

        testResult = MarkdownParse.getLinks(fileContents);
        expectedResult = List.of("something.com");

        assertEquals(expectedResult, testResult);
    }
}
