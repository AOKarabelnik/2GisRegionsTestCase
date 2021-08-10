package com.DoubleGis;

import org.junit.jupiter.api.Test;

public class StartTestCase {

    @Test
    public void firstCaseStart(){
        SearchTestCase.searchCheck();
    }

    @Test
    public void secondCaseStart(){
        CountryCodeTestCase.countryCodeCheck();
    }

    @Test
    public void thirdCaseStart(){
        PageSizeTestCase.pageFiveSizeCheck();
        PageSizeTestCase.pageTenSizeCheck();
        PageSizeTestCase.pageFifteenSizeCheck();
    }
}
