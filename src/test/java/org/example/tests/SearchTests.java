package org.example.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.example.hooks.Hooks;
import org.example.pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchTests extends Hooks {

    @Steps
    SearchPage searchPage;

    @Test
    @DisplayName("Search item")
    public void searchItem() {

        searchPage.enterItemName("iphone");

        for (int i = 0; i < searchPage.getSearchResultsList().size(); i++) {
            Assertions.assertThat(searchPage.getSearchResultsList().get(i)).isEqualToIgnoringCase("iphone");
        }
    }
}
