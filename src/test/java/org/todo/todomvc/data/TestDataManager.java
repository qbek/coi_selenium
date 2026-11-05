package org.todo.todomvc.data;

import net.serenitybdd.annotations.Steps;

public class TestDataManager {

    @Steps
    private RandomTestData randomData;

    @Steps
    private StaticTestData staticData;


    public String getTodoName() {
        return randomData.getRandomTodoName();
    }

}
