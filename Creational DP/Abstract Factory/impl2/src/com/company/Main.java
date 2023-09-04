package com.company;

import com.company.factories.GUIFactory;
import com.company.factories.WindowsFactory;

public class Main {

    public static void main(String[] args) {
	    Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        return app;
    }
}
