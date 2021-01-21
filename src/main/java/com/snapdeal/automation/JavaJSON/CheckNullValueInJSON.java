package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;
import org.testng.Assert;

import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class CheckNullValueInJSON {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("CheckNullValues.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println("Code : " + jsonObject.get("code").toString());
            System.out.println("Data : " + jsonObject.get("data"));
            System.out.println("Status : " + jsonObject.get("status"));
            Assert.assertEquals(jsonObject.get("code").toString(), "null", "Failure") ;
            Assert.assertEquals(jsonObject.get("data").toString(), "null", "Failure") ;
            Assert.assertEquals(jsonObject.get("status").toString(), "null", "Failure") ;
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
