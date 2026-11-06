package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.TodosList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Validations {

    @Steps
    TodosList todosList;

    @Step
    public void userCheckTodoDisplayed(String todoName) {
        var toList = Arrays.asList(todoName);
        userChecksAllTodosDisplayed(toList);
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
        assertThat("Todo is not displayed", todosList.getTodosNames(), hasSize(0));
    }

    @Step
    public void userChecksAllTodosDisplayed(List<String> todosNames) {
        assertThat("All todos are listed", todosList.getTodosNames(), equalTo(todosNames));
    }
}
