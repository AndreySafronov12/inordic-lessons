package org.example.l16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/org/example/l16/file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
