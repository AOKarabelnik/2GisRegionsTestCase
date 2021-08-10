package com.DoubleGis;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

public class SearchTestCase {

    public static void searchCheck(){
        RestAssured
                .given()
                .when().get("https://regions-test.2gis.com/1.0/regions?q=Акт")
                .then().body("items[0].name", equalTo("Актау"))
                .and().body("items[1].name", equalTo("Актобе")).log().all();
    }
}
