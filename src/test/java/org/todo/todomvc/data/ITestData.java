package org.todo.todomvc.data;

import java.util.List;

public interface ITestData {

    String getNewTodoName();

    String getNewProjectName();

    String getType();

    List<String> getNewTodosNames();
}
