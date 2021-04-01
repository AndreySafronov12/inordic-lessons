package org.example.l17.copy_picture.model;

import java.io.File;

public class MyFile {
    private String path;
    private File file;

    public MyFile(String path) {
        this.path = path;
        this.file = new File(path);
    }

    public File getFile() {
        return file;
    }
}
