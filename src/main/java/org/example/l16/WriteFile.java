package org.example.l16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(new File("src/main/java/org/example/l16/file3.txt"));
        writer.write("heguihtugh");
        writer.close();
    }
}
