package org.example.l17.mvc.controller;

import org.example.l17.mvc.exception.EmptyListException;
import org.example.l17.mvc.model.MyFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteMyFile {
    private MyFile myFile;
    private List<String> lines;

    public WriteMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public void writeInFile() {
        if(lines == null) {
            throw new EmptyListException();
        } else {

                try (FileWriter fileWriter = new FileWriter(myFile.getFile())) {
                    createNewFile(myFile);
                    lines.stream().forEach(lines -> {
                        try {
                            fileWriter.write(lines + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }

    public MyFile getMyFile() {
        return myFile;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    private void createNewFile (MyFile myFile) {
        try {
            new File(String.valueOf(myFile.getFile())).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
