package com.company;

import java.util.ArrayList;

public class Folder extends DataTemplate {
    private final ArrayList<DataTemplate> dataTemplates = new ArrayList<>();

    Folder(String name) {
        super(name);
        this.size = 0;
    }

    public void addDataTemplate(DataTemplate data) {
        dataTemplates.add(data);
        this.updatePath();
        if (parentFolder != null) {  //TODO неверная логика , не обновляет размер всех родительских папок верхнего уровня
            parentFolder.updateSize();
        }
        data.parentFolder = this;
    }

    //TODO: заменить поля size и path на рекурсивные методы getSize u getPath
    public void updateSize() {
        if (dataTemplates.size() > 0) {
            this.size = 0;
            for (DataTemplate data : dataTemplates) {
                size += data.size;
            }
        }
    }

    public void updatePath() {
        path = name;
        if (parentFolder != null) {
            path = parentFolder.getPath() + "/" + name;
        }
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
