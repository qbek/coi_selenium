package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NewTodo extends PageObject {

    private final By NEW_TODO_INPUT_SELECTOR = By.cssSelector("#new-todo");

    @Step("User enteres '{0}' as todo name into #NEW_TODO_INPUT_SELECTOR")
    public void enterTodoName(String name) {

        find(NEW_TODO_INPUT_SELECTOR).type(name);
    }

    @Step
    public void submitTodo() {
        find(NEW_TODO_INPUT_SELECTOR).sendKeys(Keys.ENTER);
    }
}