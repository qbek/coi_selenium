package org.todo.todomvc;

import org.junit.jupiter.api.Test;

public class TodoCreationTests extends BaseTestSetup {

    @Test
    public void userCanCreateTodo() {
        var todoName = testData.getTodoName();
        preconditions.userHasAppReady();
        actions.userCreatesANewTodo(todoName);
        validations.userCheckTodoDisplayed(todoName);
    }
}
