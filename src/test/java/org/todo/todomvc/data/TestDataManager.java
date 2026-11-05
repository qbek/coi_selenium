package org.todo.todomvc.data;

import java.util.ArrayList;
import java.util.List;

public class TestDataManager {

    private List<ITestData> testDataGenerators = new ArrayList<>();

    public TestDataManager() {
        testDataGenerators.add(new RandomTestData());
        testDataGenerators.add(new StaticTestData());
        testDataGenerators.add(new OracleTestData());
    }

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
        for (var generator : testDataGenerators) {
            if (dataType.equals(generator.getType())) {
                return generator;
            }
        }
        throw new RuntimeException("Missing env data definitions");
    }
}
