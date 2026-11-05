package org.todo.todomvc;

import org.junit.jupiter.api.Test;

public class TodoDeleteTests extends BaseTestSetup {

    @Test
    public void userCanDeleteTodo() {
        var todoName = testData.getTodoName();
        preconditions.userHasAppReady();
        preconditions.userHasTodo(todoName);
        actions.userDeletesNewTodo();
        validations.userChecksTodoIsDeleted(todoName);
    }
}

