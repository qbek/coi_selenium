package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.todo.todomvc.pageobjects.NewTodo;
import org.todo.todomvc.pageobjects.TodoFilters;
import org.todo.todomvc.pageobjects.TodosList;

import java.util.List;

public class Actions {

    @Steps
    NewTodo newTodo;

    @Steps
    TodosList todosList;

    @Steps
    TodoFilters todoFilters;

    @Step
    public void userCreatesANewTodo(String todoName) {
        newTodo.enterTodoName(todoName);
        newTodo.submitTodo();
    }

    @Step
    public void userDeletesNewTodo() {
        todosList.mouseOverTodo();
        todosList.deleteTodo();
    }

    @Step
    public void userCompletesTodo() {
        todosList.completeTodo();
    }

    @Step
    public void userFiltersActiveTodos() {
        todoFilters.gotoActive();
    }

    @Step
    public void userFiltersCompletedTodos() {
        todoFilters.gotoCompleted();
    }

    @Step
    public void userCreatesAFewTodos(List<String> todosNames) {
        for (var name : todosNames) {
            userCreatesANewTodo(name);
        }
    }
}
