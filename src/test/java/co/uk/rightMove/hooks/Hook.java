package co.uk.rightMove.hooks;

import co.uk.rightMove.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager {
    @Before
    public  void setUp(){
        launchBrowser("chrome");
    }
    @After
    public void tearDown(){
       closeBrowser();
}

}
