package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class TodosList extends PageObject {

    private final By TODO_LIST_SELECTOR = By.cssSelector("#todo-list");
    private final By TODO_COMPLETE_TOGGLE_SELECTOR = By.cssSelector(".toggle");
    private final By TODO_DELETE_SELECTOR = By.cssSelector(".destroy");
    private final By TODO_ELEMENT_SELECTOR = By.cssSelector("#todo-list li");
    private final By COMPLETED_TODO = By.cssSelector("#todo-list .completed");

    @Step
    public List<String> getTodosNames() {
//        var todoNames = new ArrayList<String>();
//        var todos = findAll(TODO_ELEMENT_SELECTOR);
//        for(var todo : todos) {
//            var name = todo.getText().strip();
//            todoNames.add(name);
//        }
//
//        var todos = findAll(TODO_ELEMENT_SELECTOR);
//        return todos.stream().map(todo ->
//                {  return todo.getText().strip();} )
//                .collect(Collectors.toList());


        var allTodos = find(TODO_LIST_SELECTOR).getText().split("\n");
        return Arrays.asList(allTodos);
    }

    @Step
    public void completeTodo() {
        find(TODO_COMPLETE_TOGGLE_SELECTOR).click();
    }

    @Step
    public void completeTodo(String todoName) {
        var allTodos = findAll(TODO_ELEMENT_SELECTOR);
        var todoEl = allTodos.filter(todo -> {
            return todo.getText().strip().equals(todoName);
        }).getFirst();

        todoEl.find(TODO_COMPLETE_TOGGLE_SELECTOR).click();
    }

    @Step
    public String getTodoElementClasses() {
        return find(TODO_ELEMENT_SELECTOR).getDomAttribute("class").strip();
    }

//    @Step
//    public String getTodoElementClasses(String todoName) {
//        var allTodos = findAll(TODO_ELEMENT_SELECTOR);
//        var todoEl = allTodos.filter(todo -> {
//            return todo.getText().strip().equals(todoName);
//        }).getFirst();
//        return todoEl.getDomAttribute("class").strip();
//    }

    @Step
    public List<String> getAllCompletedTodos() {
        var completedTodos = findAll(COMPLETED_TODO);
        var completedNames = completedTodos.map(todo -> todo.getText().strip());
        return completedNames;
    }

    @Step
    public void mouseOverTodo() {
        find(TODO_ELEMENT_SELECTOR).click();
    }

    @Step
    public void deleteTodo() {
        find(TODO_DELETE_SELECTOR).click();
    }

    public boolean theOneExists(String todoName) {
        return find(TODO_LIST_SELECTOR).containsText(todoName);
    }
}
