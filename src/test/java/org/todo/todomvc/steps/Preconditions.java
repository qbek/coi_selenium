package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.TodoMvcApp;

public class Preconditions {

    @Steps
    TodoMvcApp app;

    @Steps
    Actions actions;

    @Steps
    Validations validations;

    @Step
    public void userHasAppReady() {
        app.openMainView();
    }

    @Step
    public void userHasTodo(String todoName) {
        actions.userCreatesANewTodo(todoName);
        validations.userCheckTodoDisplayed(todoName);
    }

    @Step
    public void userHasCompletedTodo(String todoName) {
        userHasTodo(todoName);
        actions.userCompletesTodo();
    }

}
