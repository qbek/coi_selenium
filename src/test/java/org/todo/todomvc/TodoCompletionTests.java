package org.todo.todomvc;

import org.junit.jupiter.api.Test;

public class TodoCompletionTests extends BaseTestSetup {

    @Test
    public void userCanCompleteTodo() {
        var todoName = "Umyć okna";

        preconditions.userHasAppReady();
        preconditions.userHasTodo(todoName);
        actions.userCompletesTodo();
        validations.userChecksTodoCompleted();
    }

    @Test
    public void userCanFilterActiveTodos(){
        var todoName = "Umyć okna";
        preconditions.userHasAppReady();
        preconditions.userHasCompletedTodo(todoName);
        actions.userFiltersActiveTodos();
        validations.userChecksEmptyTodosList();
    }

    @Test
    public void userCanFilterCompletedTodos() {
        var todoName = "Umyć okna";
        preconditions.userHasAppReady();
        preconditions.userHasCompletedTodo(todoName);
        actions.userFiltersCompletedTodos();
        validations.userCheckTodoDisplayed(todoName);
    }
}
