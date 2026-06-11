package api.specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecs {

    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder()
                .setContentType(ContentType.XML)
                .log(LogDetail.ALL)
                .build();
    }
}
