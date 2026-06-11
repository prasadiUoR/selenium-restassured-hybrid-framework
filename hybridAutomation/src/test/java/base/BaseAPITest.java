package base;

import api.base.BaseAPI;
import org.testng.annotations.BeforeClass;

public class BaseAPITest extends BaseAPI {

    @BeforeClass
    public void setup() {
        initAPI();
    }
}
