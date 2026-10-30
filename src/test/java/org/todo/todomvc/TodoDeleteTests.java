package org.todo.todomvc;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;

public class TodoDeleteTests extends BaseTestSetup {

    @Test
    public void userCanDeleteTodo() {
        var todoName = "Zasób do zwolnienia";

        app.openMainView();
        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        todosList.mouseOverTodo();
        todosList.deleteTodo();

        assertThat("Todo is not displayed", todosList.getAllTodosNames(), emptyString());
    }
}
