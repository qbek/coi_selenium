package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

public class TodoMvcApp extends PageObject {

    private final String TODOMVC_URL = "https://todomvc.com/examples/jquery/dist/#/all";

    @Step
    public void openMainView() {
        openAt(TODOMVC_URL);
    }
}
