package org.todo.todomvc;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TodoCreationTests extends BaseTestSetup {

    @Test
    public void userCanCreateTodo() {
        var todoName = "Moje lepsze zadanie++";
        app.openMainView();
        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        var todosNames = todosList.getAllTodosNames();
        assertThat("Todo was created with correct name", todosNames, equalTo(todoName));
    }
}
