package com.company;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("Work1.doc",  "Здесь находятся файлы с работы");
        File file2 = new File("Music1.mp3", "Здесь находятся фай");
        Folder musicFolder = new Folder("Music");
        Folder imagesFolder = new Folder("Images");
        Folder documentsFolder = new Folder("Documents");

        documentsFolder.addDataTemplate(imagesFolder);
        imagesFolder.addDataTemplate(musicFolder);

        imagesFolder.addDataTemplate(file1);
        musicFolder.addDataTemplate(file2);
        System.out.println(imagesFolder);
        System.out.println("Child files and folders");
        System.out.println("-----------------------");
        System.out.println(imagesFolder.getDataTemplates());
    }
}
