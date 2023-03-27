package socket;

import static io.restassured.RestAssured.given;

public class CreateNewToken {
    public static void main(String[] args) {

        BodyToken tokenBody = new BodyToken();

        Token token = given()
                .body(tokenBody)
                .when()
                .post("https://rpd-auth-stag.betcoapps.com/connect/token")
                .then().log().all()
                .extract().as(Token.class);
    }
}
