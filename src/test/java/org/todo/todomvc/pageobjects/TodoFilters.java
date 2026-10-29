package org.todo.todomvc.pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TodoFilters extends PageObject {

    private final By ACTIVE_FILTER_SELECTOR = By.cssSelector("[href=\"#/active\"]");
    private final By COMPLETED_FILTER_SELECTOR = By.cssSelector("[href=\"#/completed\"]");

    @Step("User goes to Active tab")
    public void gotoActive() {
        find(ACTIVE_FILTER_SELECTOR).click();
    }

    @Step("User goes to Completed tab")
    public void gotoCompleted() {
        find(COMPLETED_FILTER_SELECTOR).click();
    }
}
