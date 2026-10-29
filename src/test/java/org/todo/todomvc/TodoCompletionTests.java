package org.todo.todomvc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TodoCompletionTests {

    WebDriver browser;

    private final By NEW_TODO_INPUT_SELECTOR = By.cssSelector("#new-todo");
    private final By TODO_LABEL_SELECTOR = By.cssSelector("#todo-list label");
    private final By TODO_LIST_SELECTOR = By.cssSelector("#todo-list");
    private final String TODOMVC_URL = "https://todomvc.com/examples/jquery/dist/#/all";

    private final By TODO_COMPLETE_TOGGLE_SELECTOR = By.cssSelector(".toggle");
    private final By TODO_ELEMENT_SELECTOR = By.cssSelector("#todo-list li");
    private final By ACTIVE_FILTER_SELECTOR = By.cssSelector("[href=\"#/active\"]");
    private final By COMPLETED_FILTER_SELECTOR = By.cssSelector("[href=\"#/completed\"]");

    @BeforeEach
    public void setup() {
        browser = new FirefoxDriver();
    }

    @AfterEach
    public void cleanup() {
        browser.quit();
    }


}
