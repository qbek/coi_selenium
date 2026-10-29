package org.todo.todomvc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.todo.todomvc.pageobjects.NewTodo;
import org.todo.todomvc.pageobjects.TodoFilters;
import org.todo.todomvc.pageobjects.TodoMvcApp;
import org.todo.todomvc.pageobjects.TodosList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;

public class TodoCreationTests {

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

    @Test
    public void userCanCreateTodo() {
        var todoName = "Moje lepsze zadanie++";
        app.openMainView();
        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        var todosNames = todosList.getAllTodosNames();
        assertThat("Todo was created with correct name", todosNames, equalTo(todoName));
    }

    @Test
    public void userCanCompleteTodo() {
        var todoName = "Umyć okna";
        app.openMainView();

        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        todosList.completeTodo();

        var todoClasses = todosList.getTodoElementClasses();
        assertThat("Todo is marked as completed", todoClasses, equalTo("completed") );

        todoFilters.gotoActive();
        assertThat("Todo was created with correct name", todosList.getAllTodosNames(), emptyString());

        todoFilters.gotoCompleted();
        assertThat("Todo was created with correct name", todosList.getAllTodosNames(), equalTo(todoName));
    }
}
