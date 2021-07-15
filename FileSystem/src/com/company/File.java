package com.company;

public class File extends DataTemplate {

    File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return " File:" + "\n" +
                " Name = " + name + "\n" +
                " Size = " + size + "\n" +
                " Path = " + getPath() + "\n" +
                " ParentFolder: " + parentFolder.name + "\n" + "\n";
    }

}
