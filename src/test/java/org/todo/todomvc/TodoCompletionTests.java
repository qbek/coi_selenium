package org.todo.todomvc;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;

public class TodoCompletionTests extends BaseTestSetup {

    @Test
    public void userCanCompleteTodo() {
        var todoName = "Umyć okna";
        app.openMainView();

        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        todosList.completeTodo();

        var todoClasses = todosList.getTodoElementClasses();
        assertThat("Todo is marked as completed", todoClasses, equalTo("completed") );
    }

    @Test
    public void userCanFilterActiveTodos(){
        var todoName = "Umyć okna";
        app.openMainView();

        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        todosList.completeTodo();

        todoFilters.gotoActive();
        assertThat("Todo is not displayed", todosList.getAllTodosNames(), emptyString());
    }

    @Test
    public void userCanFilterCompletedTodos() {
        var todoName = "Umyć okna";
        app.openMainView();

        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();

        todosList.completeTodo();

        todoFilters.gotoCompleted();
        assertThat("Todo was created with correct name", todosList.getAllTodosNames(), equalTo(todoName));
    }
}
