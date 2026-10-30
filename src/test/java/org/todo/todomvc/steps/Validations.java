package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.TodosList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Validations {

    @Steps
    TodosList todosList;

    public void userCheckTodoDisplayed(String todoName) {
        var todosNames = todosList.getAllTodosNames();
        assertThat("Todo was created with correct name", todosNames, equalTo(todoName));
    }
}
