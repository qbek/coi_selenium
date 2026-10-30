package org.todo.todomvc;

import org.junit.jupiter.api.Test;

public class TodoDeleteTests extends BaseTestSetup {

    @Test
    public void userCanDeleteTodo() {
        var todoName = "Zasób do zwolnienia";
        preconditions.userHasAppReady();
        preconditions.userHasTodo(todoName);
        actions.userDeletesNewTodo();
        validations.userChecksTodoIsDeleted(todoName);
    }
}

