package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author eroshenkoam (Artem Eroshenko).
 */

public class IssuesWebTest {

    @Test
    @AllureId("90346")
    @DisplayName("Creating new issue by authorized user")
    @Tags({@Tag("web"), @Tag("regress"), @Tag("smoke")})
    @Story("Create new issue")
    @Owner("eroshenkoam")
    @Feature("Issues")
    public void shouldCreateIssue() {

        step("create web driver");

        step("Open the main page", ()-> {
            Allure.addAttachment("web page address", "https://github.com");
        });
        step("Create an issue", () -> {
            step("click issues link on the menu");
            step("Click new issue button");
            step("add title");
            step("add body");
            step("click Submit new issue");
        });
        step("Check if issue has been created", () -> {
            step("Check new ID created");
            step("Check Title is present");
        });
        step("Stop web driver");

    }


}