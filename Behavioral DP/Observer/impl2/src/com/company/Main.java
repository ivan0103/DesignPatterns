package com.company;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.attach("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.attach("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
