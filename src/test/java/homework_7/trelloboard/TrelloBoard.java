package homework_7.trelloboard;

import com.fasterxml.jackson.core.JsonProcessingException;
import homework_7.trelloboard.TrelloApiBaseTest;
import homework_7.trelloboard.cards.CardRequest;
import homework_7.trelloboard.cards.CardResponse;
import homework_7.trelloboard.lists.ListRequest;
import homework_7.trelloboard.lists.ListResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TrelloBoard extends TrelloApiBaseTest {

    @Test
    public void createBoardTest() {


        given()
                .body("{ \"name\": \"Api Testing Board1\" }")
                .when()
                .post("boards")
                .then()
                .statusCode(200)
                .body("id", not(emptyString()),
                        "name", equalTo("Api Testing Board1"));
    }

    @Test
    public void createTagTest() {

        given()
                .body("{ \"value\": \"5abbe4b7ddc1b351ef961414\" }")
                .when()
                .post("boards/5ee4bc310f8c9d57ad3b175c/idTags")
                .then()
                .statusCode(403)
                .body(isEmptyString());

    }

    @Test
    public void createListTest() throws JsonProcessingException {
        ListRequest list = new ListRequest("TestList2", "5ee4c762713a781802aca33e");
        ListResponse listResponse = given()
                .body(list)
                .when()
                .post("lists")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(ListResponse.class);

        output(listResponse);
    }

    @Test
    public void createCardTest() throws Exception {
        CardRequest cardRequest = new CardRequest("TestCard11","TestCard for TestList", "5ee5093ae3806d60ae29385c", "5edf37648f501a0bca3c0f8c");
        CardResponse cardResponse = given()
                .body(cardRequest)
                .when()
                .post("cards")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(CardResponse.class);

        output(cardResponse);
    }

}
