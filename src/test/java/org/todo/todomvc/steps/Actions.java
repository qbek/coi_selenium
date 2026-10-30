package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.NewTodo;

public class Actions {

    @Steps
    NewTodo newTodo;

    public void userCreatesANewTodo(String todoName) {
        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();
    }
}
