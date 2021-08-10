package com.DoubleGis;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class PageSizeTestCase {


    public static void pageFiveSizeCheck(){
        RestAssured
                .given()
                .when().get("https://regions-test.2gis.com/1.0/regions?page_size=5")
                .then().body("items", hasSize(5))
                .log().all();
    }
    public static void pageTenSizeCheck(){
        RestAssured
                .given()
                .when().get("https://regions-test.2gis.com/1.0/regions?page_size=10")
                .then().body("items", hasSize(10))
                .log().all();
    }
    public static void pageFifteenSizeCheck(){
        RestAssured
                .given()
                .when().get("https://regions-test.2gis.com/1.0/regions?page_size=15")
                .then().body("items", hasSize(15))
                .log().all();
    }


}
