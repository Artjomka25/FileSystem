package com.company;

public abstract class DataTemplate {
    protected String name;
    protected int size;
    protected String path;
    protected Folder parentFolder;

    DataTemplate(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }
}
