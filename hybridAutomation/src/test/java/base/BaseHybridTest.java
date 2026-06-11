package base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ui.base.BaseUI;
import utils.ConfigReader;

public class BaseHybridTest extends BaseUI {
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;

    @BeforeClass
    public void setup() {

        initUI();
        initAPI();
    }

    private void initAPI() {

        RestAssured.baseURI =
                ConfigReader.get("base.url");

        requestSpecification =
                new RequestSpecBuilder()
                        .setContentType(ContentType.XML)
                        .build();

        responseSpecification =
                new ResponseSpecBuilder()
                        .expectContentType(ContentType.XML)
                        .build();
    }

    @AfterClass
    public void tearDown() {

        closeBrowser();
    }
}
