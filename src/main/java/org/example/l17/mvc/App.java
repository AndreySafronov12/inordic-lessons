package org.example.l17.mvc;

import org.example.l17.mvc.controller.ReadMyFile;
import org.example.l17.mvc.controller.WriteMyFile;
import org.example.l17.mvc.model.MyFile;
import org.example.l17.mvc.view.Console;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Какой файл хотите скопировать?");
        String pathCopy = new Console().print();
        MyFile myFile = new MyFile(pathCopy);
        ReadMyFile readMyFile = new ReadMyFile(myFile);
        List<String> stringList = readMyFile.getStringList();

        System.out.println("Куда скопировать?");
        String pathResult = new Console().print();
        MyFile myFileWrite = new MyFile(pathResult);
        WriteMyFile writeMyFile = new WriteMyFile(myFileWrite);
        writeMyFile.setLines(stringList);
        writeMyFile.writeInFile();
        Console.close();
    }
}
