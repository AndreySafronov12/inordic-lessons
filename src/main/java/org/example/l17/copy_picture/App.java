package org.example.l17.copy_picture;

import org.example.l17.copy_picture.controller.ReadMyFile;
import org.example.l17.copy_picture.controller.WriteMyFile;
import org.example.l17.copy_picture.model.MyFile;
import org.example.l17.copy_picture.view.Console;

public class App {
    public static void main(String[] args) {
        System.out.println("Укажите имя копируемого файла: ");
        String pathCopy = new Console().print();
        MyFile myFile = new MyFile(pathCopy);
        ReadMyFile readMyFile = new ReadMyFile(myFile);
        byte[] buffer = readMyFile.getBuffer();

        System.out.println("Укажите куда скопировать файл: ");
        String pathResult = new Console().print();
        MyFile myFileWrite = new MyFile(pathResult);
        WriteMyFile writeMyFile = new WriteMyFile(myFileWrite);
        writeMyFile.setBuffer(buffer);
        writeMyFile.writeInFile();
        Console.close();
    }
}
