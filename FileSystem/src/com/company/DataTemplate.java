package com.company;

public abstract class DataTemplate {
    protected Folder parentFolder;
    protected String name;

    DataTemplate(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public String getPath(){
        String path = name;
        if (parentFolder != null) {
            path = parentFolder.getPath() + "/" + name;
        }
        return path;
    }
}
