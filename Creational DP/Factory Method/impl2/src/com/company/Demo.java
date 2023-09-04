package com.company;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args){
        configure();
        runBusinessLogic();

    }

    static void configure(){
        if (System.getProperty("os.name").equals("WIndows 10") /*true*/) {
            dialog = new WindowsDialog();
        }
        else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
