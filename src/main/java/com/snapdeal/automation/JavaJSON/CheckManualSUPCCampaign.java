package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;
import org.testng.Assert;
import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class CheckManualSUPCCampaign {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("CheckManualSUPCCampaign.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println("Code : " + jsonObject.get("code").toString());
            System.out.println("Data : " + jsonObject.get("data"));
            System.out.println("Status : " + jsonObject.get("status"));
            
            System.out.println(jsonObject.getJSONObject("data").get("Sbec72")) ;
            
            JSONArray jsonarr= jsonObject.getJSONObject("data").getJSONArray("aace21");
            
            for(int i = 0 ; i < jsonarr.length() ; i++) {
            	System.out.println(jsonarr.getJSONObject(i).get("sellerCode"));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
