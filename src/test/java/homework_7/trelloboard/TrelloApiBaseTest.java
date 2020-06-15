package homework_7.trelloboard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;

public abstract class TrelloApiBaseTest {

    protected RequestSpecification requestSpecification;
    protected ObjectMapper mapper = new ObjectMapper();


    @BeforeMethod
    public void setUp() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/1/")
                .addQueryParam("key","b930d979b34cb62d1aa6a7dc182a52e2")
                .addQueryParam("token", "b78c1d410d2c4d6d8ba895626f76d059ee821ee5011321c161b7cd55a4037f83")
                .setContentType(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .log(LogDetail.ALL)
                .build();

        RestAssured.requestSpecification = requestSpecification;
    }

    public void output(Object param) throws JsonProcessingException {
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(param));
    }

}
