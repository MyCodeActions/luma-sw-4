package com.softwaretestingboard.testsuite;

import com.softwaretestingboard.pages.WomenPage;
import com.softwaretestingboard.testbase.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {


    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Accept Consent
        womenPage.acceptConsent();

        // Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        // Mouse Hover on the ‘Tops’
        womenPage.hoverOnTops();

        // Click on the ‘Jackets’
        womenPage.clickOnJackets();

        List<String> jacketsNameListBefore = womenPage.getJacketsNamesList();

        // Select Sort By filter “Product Name”
        womenPage.selectSortByFilter("Product Name");
        Thread.sleep(1000);

        // Get Jackets Names After Sorting
        List<String> jacketsNameListAfter = womenPage.getJacketsNamesList();
        Thread.sleep(1000);

        // Verify the jackets names are sorted in alphabetical order
        womenPage.verifySortedOrder(jacketsNameListBefore, jacketsNameListAfter);
    }


    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        // Accept Consent
        womenPage.acceptConsent();

        // Mouse Hover on the ‘Women’ Menu
        womenPage.hoverOnWomenMenu();

        // Mouse Hover on the ‘Tops’
        womenPage.hoverOnTops();


        // Click on the ‘Jackets’
        womenPage.clickOnJackets();

        // Select Sort By filter “Price”
        womenPage.selectSortByFilter("Price");
        Thread.sleep(1000);

    }
}



