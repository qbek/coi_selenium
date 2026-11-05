package org.todo.todomvc.data;

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
}
