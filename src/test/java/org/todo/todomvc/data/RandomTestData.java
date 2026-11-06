package org.todo.todomvc.data;

import com.github.javafaker.Faker;

import java.util.List;

public class RandomTestData implements ITestData {

    @Override
    public String getNewTodoName() {
        return Faker.instance().chuckNorris().fact();
    }

    @Override
    public String getNewProjectName() {
        return "";
    }

    @Override
    public String getType() {
        return "random";
    }

    @Override
    public List<String> getNewTodosNames() {
        var count = Faker.instance().number().numberBetween(2, 5);
        return Faker.instance().lorem().sentences(count);
    }
}
