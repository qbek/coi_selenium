package org.todo.todomvc.data;

public class StaticTestData implements ITestData {

    @Override
    public String getNewTodoName() {
        return "To jest statyczne todo name";
    }

    @Override
    public String getNewProjectName() {
        return "";
    }
}
