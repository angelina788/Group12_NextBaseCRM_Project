package com.Group12.tests.Mustafa.UserStory_9;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_G12_107 {

    @Test
    public void test1(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue("Hello".equals("Hello"),"1 FAILED");


        softAssert.assertTrue("Hello".equals("ello"),"2 FAILED");


        softAssert.assertTrue("Hello".equals("Hello"),"3 FAILED");

        softAssert.assertTrue("Hello".equals("aello"),"2 FAILED");

        softAssert.assertAll();

    }
}
