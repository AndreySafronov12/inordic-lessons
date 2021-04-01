package org.example.l16.file_rewriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileReader extends Reader {
    private String line;
    private BufferedReader bufferedReader;

    public FileReader(String line) {
        this.line = line;

    }

    public BufferedReader readFile() {
        String path = null;
        System.out.println("Введите путь к файлу: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            path = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = new FileReader(path);

        return new BufferedReader(fileReader);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}




