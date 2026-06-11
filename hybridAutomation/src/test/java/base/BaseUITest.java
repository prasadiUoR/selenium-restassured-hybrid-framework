package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ui.base.BaseUI;

public class BaseUITest extends BaseUI {
    @BeforeClass
    public void setup() {
        initUI();
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }
}
