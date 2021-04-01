package org.example.l16;

import java.io.*;

public class FileTextInputReader {
    public static void main(String[] args) throws IOException {
        // 1 вариант
        // файл с байтами
        InputStream inputStream = new FileInputStream("src/main/java/org/example/l16/file.txt");
        // конвертирует из байтового потока в символьный
        try (InputStreamReader reader = new InputStreamReader(inputStream,"UTF-8")) {
            int character;
            while((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
        //reader.close();
    }
}
