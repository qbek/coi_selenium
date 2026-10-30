package org.todo.todomvc.steps;

import net.serenitybdd.annotations.Steps;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import org.todo.todomvc.pageobjects.TodosList;

import java.time.Duration;
import java.util.concurrent.Callable;

public class JustForWait {

    @Steps
    TodosList todosList;

    public void todoNamed(String todoName) {
        var condition = new WaitForTodo(todoName);
        try {
            Awaitility.await()
                    .pollInSameThread()
//                .pollDelay(Duration.ofSeconds(10))
                    .atMost(Duration.ofSeconds(20))
                    .pollInterval(Duration.ofSeconds(2))
                    .until(condition);
        } catch (ConditionTimeoutException e) {
            throw new AssertionError("Todo with given name have not appered!" + e);
        }

    }

    private class WaitForTodo implements Callable<Boolean> {

        private String name;

        public WaitForTodo(String name) {
            this.name = name;
        }

        @Override
        public Boolean call() throws Exception {
            System.out.println("czekam!!!");
            return todosList.theOneExists(name);
        }
    }


}
