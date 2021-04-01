package org.example.l17.mvc.controller;

import org.example.l17.mvc.model.MyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadMyFile {

    private List<String> stringList;

    {
        stringList = new ArrayList<>();
    }

    public ReadMyFile(MyFile myFile) {

        try (BufferedReader buf = new BufferedReader(new FileReader(myFile.getFile()))) {
            String curLine;
            while ((curLine = buf.readLine())!= null){
                stringList.add(curLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getStringList() {
        return stringList;
    }

}
