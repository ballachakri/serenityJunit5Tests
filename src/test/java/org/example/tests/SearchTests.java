package org.example.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.example.pages.SearchPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchTests extends UIInteractions {

    @Managed(driver = "chrome")

    @Steps
    SearchPage searchPage;

    @BeforeEach
    @DisplayName("Open browser")
    public void openBrowser() {
        openUrl("https://tutorialsninja.com/demo/");
    }

    @Test
    @DisplayName("Search item")
    public void searchItem() {

        searchPage.enterItemName("iphone");

        for (int i = 0; i < searchPage.getSearchResultsList().size(); i++) {
            Assertions.assertThat(searchPage.getSearchResultsList().get(i)).isEqualToIgnoringCase("iphone");
        }
    }
}
