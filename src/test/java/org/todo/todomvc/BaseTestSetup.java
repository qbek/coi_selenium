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
import org.todo.todomvc.steps.Actions;
import org.todo.todomvc.steps.Preconditions;
import org.todo.todomvc.steps.Validations;

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

    @Steps
    Actions actions;

    @Steps
    Preconditions preconditions;

    @Steps
    Validations validations;
}
