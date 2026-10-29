package org.todo.todomvc.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodosList {

    WebDriver browser;

    private final By TODO_LIST_SELECTOR = By.cssSelector("#todo-list");
    private final By TODO_COMPLETE_TOGGLE_SELECTOR = By.cssSelector(".toggle");
    private final By TODO_ELEMENT_SELECTOR = By.cssSelector("#todo-list li");

    public TodosList(WebDriver browser) {
        this.browser = browser;
    }

    public String getAllTodosNames(){
        var todosListEl = browser.findElement(TODO_LIST_SELECTOR);
        return todosListEl.getText();
    }

    public void completeTodo() {
        var completeToggle = browser.findElement(TODO_COMPLETE_TOGGLE_SELECTOR);
        completeToggle.click();
    }

    public String getTodoElementClasses() {
        var todo = browser.findElement(TODO_ELEMENT_SELECTOR);
        return todo.getAttribute("class").strip();
    }

}
