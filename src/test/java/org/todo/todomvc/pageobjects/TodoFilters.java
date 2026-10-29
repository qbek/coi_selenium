package org.todo.todomvc.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoFilters {

    WebDriver browser;

    private final By ACTIVE_FILTER_SELECTOR = By.cssSelector("[href=\"#/active\"]");
    private final By COMPLETED_FILTER_SELECTOR = By.cssSelector("[href=\"#/completed\"]");

    public TodoFilters (WebDriver browser) {
        this.browser = browser;
    }

    public void gotoActive() {
        var activeFilter = browser.findElement(ACTIVE_FILTER_SELECTOR);
        activeFilter.click();
    }

    public void gotoCompleted() {
        var completedFilter = browser.findElement(COMPLETED_FILTER_SELECTOR);
        completedFilter.click();
    }
}
