package org.example.hooks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class Hooks extends UIInteractionSteps{

    @BeforeEach
    @DisplayName("Open browser")
    public void openBrowser(){
        openUrl("https://tutorialsninja.com/demo/");
    }
}
