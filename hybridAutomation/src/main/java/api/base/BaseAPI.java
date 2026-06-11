package api.base;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.ConfigReader;

public class BaseAPI {
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;

    protected void initAPI() {

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

}
