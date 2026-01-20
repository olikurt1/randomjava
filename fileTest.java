import java.nio.file.*;
import java.io.IOException;


public class fileTest {
    public static void main(String[] args) throws Exception{
        Path fileTestPath = Path.of("testtest.txt");
        Files.createFile(fileTestPath);
    }
}
