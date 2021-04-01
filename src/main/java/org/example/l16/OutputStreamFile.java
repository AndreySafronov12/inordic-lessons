package org.example.l16;

import java.io.*;

public class OutputStreamFile {
    public static void main(String[] args) throws IOException {
        File file = new File("file2.txt");
        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        // 1
        bufferedWriter.write("Hello world");

        // 2
        bufferedWriter.newLine();
        bufferedWriter.write("I love JAVA");
        bufferedWriter.close();

    }
}
