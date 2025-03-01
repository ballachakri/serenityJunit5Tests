package org.example.pages;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;

public class SearchPage extends UIInteractions {


    @Step("Enter item name")
    public void enterItemName(String item) {
        $(By.cssSelector("input[name='search']")).sendKeys(item,Keys.ENTER);
    }


    @Step("Return search results list")
    public List<String> getSearchResultsList() {
        return $$(By.cssSelector("div[class='product-thumb'] h4 a")).textContents();
    }
}
