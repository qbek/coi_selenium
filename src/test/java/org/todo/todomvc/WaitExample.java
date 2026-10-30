package org.todo.todomvc;

import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.todo.todomvc.steps.JustForWait;

public class WaitExample extends BaseTestSetup {

    @Steps
    JustForWait waitFor;


    @Test
    public void userWaitsForTheONE() {
        preconditions.userHasAppReady();
        waitFor.todoNamed("THE ONE!!!");
    }
}
