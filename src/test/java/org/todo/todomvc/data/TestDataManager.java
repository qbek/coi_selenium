package org.todo.todomvc.data;

import net.serenitybdd.annotations.Steps;

public class TestDataManager {

    @Steps
    private RandomTestData randomData;

    @Steps
    private StaticTestData staticData;


    public String getTodoName() {
        var dataType = System.getProperty("data", "");
        switch (dataType) {
            case "random":
                return randomData.getRandomTodoName();

            case "static":
                return staticData.getTodoName();
        }

        throw new RuntimeException("Missing env data definitions");
    }

}
