package com.company;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("Work1.doc", 12);
        File file2 = new File("Music1.mp3", 75);

        Folder music = new Folder("Music");
        Folder images = new Folder("Images");
        Folder documents = new Folder("Documents");

        documents.addDataTemplate(images);
        images.addDataTemplate(music);

        images.addDataTemplate(file1);
        music.addDataTemplate(file2);
        System.out.println(images);
        System.out.println("Child files and folders");
        System.out.println("-----------------------");
        System.out.println(images.getDataTemplates());
    }
}
