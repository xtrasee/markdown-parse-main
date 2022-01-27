import org.junit.*;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.List;
import  java.nio.file.Files;
import java.nio.file.Path;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks() throws IOException{
        List<String> expected = List.of("https://something.com","some-page.html");
        String contents = Files.readString(Path.of("test-file.md"));
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks2() throws IOException{
        List<String> expected = List.of("www.youtube.com");
        String contents = Files.readString(Path.of("morelinks.md"));
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
}
