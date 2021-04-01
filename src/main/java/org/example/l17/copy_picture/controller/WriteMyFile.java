package org.example.l17.copy_picture.controller;

import org.example.l17.copy_picture.exception.EmptyListException;
import org.example.l17.copy_picture.model.MyFile;

import java.io.*;

public class WriteMyFile {
    private MyFile myFile;
    private byte[] buffer;

    public WriteMyFile(MyFile myFile) {
        this.myFile = myFile;
    }

    public void writeInFile() {
        if (buffer == null) {
            throw new EmptyListException("Файл пустой!");
        } else {
            try (FileOutputStream outputStream = new FileOutputStream(myFile.getFile())) {
                createNewFile(myFile);
                outputStream.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setBuffer(byte[] buffer) {
        this.buffer = buffer;
    }

    private void createNewFile (MyFile myFile) {
        try {
            new File(String.valueOf(myFile.getFile())).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
