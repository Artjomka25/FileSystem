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
    public String toString() {
        return " File:" + "\n" +
                " Path = " + getPath() + "\n" +
                " Size = " + getSize() + "\n" + "\n";
    }
}
