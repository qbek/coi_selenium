package org.todo.todomvc.data;

import java.util.Arrays;
import java.util.List;

public class StaticTestData implements ITestData {

    @Override
    public String getNewTodoName() {
        return "To jest statyczne todo name";
    }

    @Override
    public String getNewProjectName() {
        return "";
    }

    @Override
    public String getType() {
        return "static";
    }

    @Override
    public List<String> getNewTodosNames() {
        return Arrays.asList("todo 1", "todo 2", "todo 3");
    }
}
