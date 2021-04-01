package org.example.l17.mvc.model;


import java.io.File;

public class MyFile {
    private String path;
    private File file;

    public MyFile(String path, File file) {
        this.path = path;
        this.file = file;
    }

    public MyFile(String path) {
        this.path = path;
        file = new File(path);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
