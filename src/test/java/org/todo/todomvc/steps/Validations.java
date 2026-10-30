package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.TodosList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;

public class Validations {

    @Steps
    TodosList todosList;

    @Step
    public void userCheckTodoDisplayed(String todoName) {
        var todosNames = todosList.getAllTodosNames();
        assertThat("Todo was created with correct name", todosNames, equalTo(todoName));
    }

    @Step
    public void userChecksTodoIsDeleted(String todoName) {
        userChecksEmptyTodosList();
    }

    @Step
    public void userChecksTodoCompleted() {
        var todoClasses = todosList.getTodoElementClasses();
        assertThat("Todo is marked as completed", todoClasses, equalTo("completed") );
    }

    @Step
    public void userChecksEmptyTodosList() {
        assertThat("Todo is not displayed", todosList.getAllTodosNames(), emptyString());
    }
}
