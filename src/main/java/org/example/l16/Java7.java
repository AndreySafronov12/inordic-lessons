package org.example.l16;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Java7 {
    public static void main(String[] args) throws IOException {
        // Reading
        List<String> text = Files.readAllLines(Path.of("src/main/java/org/example/l16/file3.txt"));
        text.forEach(System.out::println);

        // Writing
        List<String> stringList = Arrays.asList("Hello world!!");
        Files.write(Paths.get("writeJava7"), stringList, StandardCharsets.UTF_8);

    }
}
