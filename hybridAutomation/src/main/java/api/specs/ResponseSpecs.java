package api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecs {

    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.XML)
                .log(LogDetail.ALL)
                .build();
    }
}
