package org.todo.todomvc.data;

import java.util.List;

public class OracleTestData implements ITestData {
    @Override
    public String getNewTodoName() {
        return "ORACLE!!!!!!!";
    }

    @Override
    public String getNewProjectName() {
        return "";
    }

    @Override
    public String getType() {
        return "oracle";
    }

    @Override
    public List<String> getNewTodosNames() {
        return List.of();
    }
}
