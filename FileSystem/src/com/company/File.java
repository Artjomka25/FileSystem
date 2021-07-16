package com.company;

public class File extends DataTemplate {
    private String content;

    File(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public int getSize() {
       return content.length();
    }

    @Override
    public String getPath() {
        String path = name;
        if (parentFolder != null) {
            path = parentFolder.getPath() + "/" + name;
        }
        return path;
    }

    @Override
    public String toString() {
        return " File:" + "\n" +
                " Name = " + name + "\n" +
                " Size = " + getSize() + "\n" +
                " Path = " + getPath() + "\n" +
                " ParentFolder: " + parentFolder.name + "\n" + "\n";
    }
}
