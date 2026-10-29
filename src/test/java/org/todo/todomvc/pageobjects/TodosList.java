package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TodosList extends PageObject {

    private final By TODO_LIST_SELECTOR = By.cssSelector("#todo-list");
    private final By TODO_COMPLETE_TOGGLE_SELECTOR = By.cssSelector(".toggle");
    private final By TODO_ELEMENT_SELECTOR = By.cssSelector("#todo-list li");

    @Step
    public String getAllTodosNames(){
        return find(TODO_LIST_SELECTOR).getText();
    }

    @Step
    public void completeTodo() {
        find(TODO_COMPLETE_TOGGLE_SELECTOR).click();
    }

    @Step
    public String getTodoElementClasses() {
        return find(TODO_ELEMENT_SELECTOR).getDomAttribute("class").strip();
    }

}
