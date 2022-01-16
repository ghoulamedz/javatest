import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Lines {
    Path path ;
    Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
     Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));

    public Lines() throws IOException {
    }
}