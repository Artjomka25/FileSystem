package com.company;

import java.util.ArrayList;

public class Folder extends DataTemplate {
    private final ArrayList<DataTemplate> dataTemplates = new ArrayList<>();

    Folder(String name) {
        super(name);
    }

    public void addDataTemplate(DataTemplate data) {
        dataTemplates.add(data);
        data.parentFolder = this;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (DataTemplate dataTemplate : dataTemplates) {
            size += dataTemplate.getSize();
        }
        return size;
    }

    @Override
    public String getPath() {
        String path = name;
        if (parentFolder != null) {
            path = parentFolder.getPath() + "/" + name;
        }
        return path;
    }

    public ArrayList<DataTemplate> getDataTemplates() {
        return dataTemplates;
    }

    @Override
    public String toString() {
        String str = " Folder:" + "\n" + " Name = " + name + "\n" + " Size = " + getSize() + "\n";
        if (parentFolder != null) {
            str += " Path = " + getPath() + "\n";
        } else {
            str += " Path = " + name + "/\n";
        }
        if (parentFolder != null) {
            str += " ParentFolder: " + parentFolder.name + "\n";
        } else {
            str += " ParentFolder: No\n";
        }
        str += " Amount of elements = " + dataTemplates.size() + "\n" + "\n";
        return str;
    }
}
