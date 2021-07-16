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

    public ArrayList<DataTemplate> getDataTemplates() {
        return dataTemplates;
    }

    @Override
    public String toString() {
        return " Folder:" + "\n" + " Path = " + getPath() + "\n" +
                " Size = " + getSize() + "\n" +
                " Amount of elements = " + dataTemplates.size() + "\n" + "\n";
    }
}
