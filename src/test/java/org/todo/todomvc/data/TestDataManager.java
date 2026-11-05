package org.todo.todomvc.data;

public class TestDataManager {


    private ITestData randomData = new RandomTestData();
    private ITestData staticData = new StaticTestData();


    public String getTodoName() {
        var dataProvider = getInterface();
        return dataProvider.getNewTodoName();
    }

    public String getProjectName() {
        var dataProvider = getInterface();
        return dataProvider.getNewProjectName();
    }

    private ITestData getInterface() {
        var dataType = System.getProperty("data", "");
        switch( dataType) {
            case "random":
                return randomData;
            case "static":
                return staticData;
        }
        throw new RuntimeException("Missing env data definitions");
    }
}
