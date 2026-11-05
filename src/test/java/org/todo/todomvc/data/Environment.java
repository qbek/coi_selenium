package org.todo.todomvc.data;

import java.io.IOException;
import java.util.Properties;

public class Environment {

    public static final String TODOMVC_URL;

    static {
        var envName = System.getProperty("env");
        var file = Environment.class.getResourceAsStream("/" + envName + ".env.properties");
        var cfg = new Properties();
        try {
            cfg.load(file);
            TODOMVC_URL = cfg.getProperty("URL");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
