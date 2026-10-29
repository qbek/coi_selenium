package org.todo.todomvc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.todo.todomvc.pageobjects.NewTodo;
import org.todo.todomvc.pageobjects.TodoFilters;
import org.todo.todomvc.pageobjects.TodoMvcApp;
import org.todo.todomvc.pageobjects.TodosList;

public class BaseTestSetup {

    WebDriver browser;
    NewTodo newTodo;
    TodosList todosList;
    TodoFilters todoFilters;
    TodoMvcApp app;

    @BeforeEach
    public void setup() {
        browser = new FirefoxDriver();
        newTodo = new NewTodo(browser);
        todosList = new TodosList(browser);
        todoFilters = new TodoFilters(browser);
        app = new TodoMvcApp(browser);
    }

    @AfterEach
    public void cleanup() {
        browser.quit();
    }
}
