package com.DoubleGis;

import io.restassured.RestAssured;
import java.util.ArrayList;
import static org.hamcrest.Matchers.is;

public class CountryCodeTestCase {
    private static final int COUNT_REGIONS_RU = 13;

    public static void countryCodeCheck(){
        RestAssured
                .given()
                .when().get("https://regions-test.2gis.com/1.0/regions?page_size=15&country_code=ru")
                .then().body("items.country.code", is(createListRegionsRu(COUNT_REGIONS_RU)))
                .log().all();
    }

    public static ArrayList<String> createListRegionsRu(int count){
        ArrayList<String> regions = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            regions.add("ru");
        }
        return regions;
    }
}
