package org.todo.todomvc.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewTodo {

    private final By NEW_TODO_INPUT_SELECTOR = By.cssSelector("#new-todo");

    private WebDriver browser;

    public NewTodo (WebDriver browser) {
        this.browser = browser;
    }

    public void enterTodoName(String name) {
        var input = browser.findElement(NEW_TODO_INPUT_SELECTOR);
        input.sendKeys(name);
    }

    public void submitTodo() {
        var input = browser.findElement(NEW_TODO_INPUT_SELECTOR);
        input.sendKeys(Keys.ENTER);
    }

}