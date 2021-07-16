package com.company;

public abstract class DataTemplate {
    protected Folder parentFolder;
    protected String name;

    DataTemplate(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public abstract String getPath();
}
