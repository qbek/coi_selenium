package org.todo.todomvc;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.todo.todomvc.pageobjects.NewTodo;
import org.todo.todomvc.pageobjects.TodoFilters;
import org.todo.todomvc.pageobjects.TodoMvcApp;
import org.todo.todomvc.pageobjects.TodosList;

@ExtendWith(SerenityJUnit5Extension.class)
public class BaseTestSetup {

    @Managed(driver = "firefox")
    WebDriver browser;

    @Steps
    NewTodo newTodo;

    @Steps
    TodosList todosList;

    @Steps
    TodoFilters todoFilters;

    @Steps
    TodoMvcApp app;
}
