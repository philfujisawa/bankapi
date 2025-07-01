package com.estudo.bankapi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class TransferApiTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    void testTransferComSucesso() {
        String uniqueKey = "testkey" + System.currentTimeMillis();
        given()
                .header("Content-Type", "application/json")
                .body("{\"fromAccount\":\"123\",\"toAccount\":\"456\",\"amount\":500,\"idempotencyKey\":\"" + uniqueKey + "\"}")
                .when()
                .post("/transfer")
                .then()
                .statusCode(200)
                .body(containsString("Transferência completada com sucesso"));
    }

    @Test
    void testTransferComChaveRepetida() {
        given()
                .header("Content-Type", "application/json")
                .body("{\"fromAccount\":\"123\",\"toAccount\":\"456\",\"amount\":500,\"idempotencyKey\":\"duplicatekey\"}")
                .when()
                .post("/transfer")
                .then()
                .statusCode(200)
                .body(containsString("Transferência completada com sucesso"));

        given()
                .header("Content-Type", "application/json")
                .body("{\"fromAccount\":\"123\",\"toAccount\":\"456\",\"amount\":500,\"idempotencyKey\":\"duplicatekey\"}")
                .when()
                .post("/transfer")
                .then()
                .statusCode(200)
                .body(containsString("Transferência já foi processada"));
    }
}
