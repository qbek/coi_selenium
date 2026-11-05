package org.todo.todomvc.data;

import com.github.javafaker.Faker;

public class RandomTestData {

    public String getRandomTodoName() {
        return Faker.instance().chuckNorris().fact();
    }
}
