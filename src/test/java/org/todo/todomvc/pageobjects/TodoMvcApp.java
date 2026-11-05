package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.todo.todomvc.data.Environment;

public class TodoMvcApp extends PageObject {

    @Step
    public void openMainView() {
        openAt(Environment.TODOMVC_URL);



    }
}
