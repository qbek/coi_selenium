package org.todo.todomvc.pageobjects;

import org.openqa.selenium.WebDriver;

public class TodoMvcApp {

    private final String TODOMVC_URL = "https://todomvc.com/examples/jquery/dist/#/all";

    private WebDriver browser;

    public TodoMvcApp(WebDriver browser) {
        this.browser = browser;
    }

    public void openMainView() {
        browser.get(TODOMVC_URL);
    }
}
