package org.todo.todomvc.data;

import com.github.javafaker.Faker;

public class RandomTestData implements ITestData {

    @Override
    public String getNewTodoName() {
        return Faker.instance().chuckNorris().fact();
    }

    @Override
    public String getNewProjectName() {
        return "";
    }
}
