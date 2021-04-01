package org.example.l17.copy_picture.controller;

import org.example.l17.copy_picture.model.MyFile;

import java.io.*;

public class ReadMyFile {
    private byte[] buffer;


    public ReadMyFile(MyFile myFile) {
        try (InputStream inputStream = new FileInputStream(myFile.getFile())) {
            buffer = inputStream.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public byte[] getBuffer() {
        return buffer;
    }
}
