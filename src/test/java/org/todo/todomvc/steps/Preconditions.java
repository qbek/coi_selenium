package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.TodoMvcApp;

public class Preconditions {

    @Steps
    TodoMvcApp app;

    public void userHasAppReady() {
        app.openMainView();
    }
}
