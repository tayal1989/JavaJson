package com.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class ReadPOGFromDP {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("DPPog.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            JSONObject responseSro = jsonObject.getJSONObject("responseSro");
            String deviceId = "1f79e3d39b7f19371" ;
            JSONArray pog = responseSro.getJSONObject("{\"type\":\"device\",\"value\":\"" + deviceId + "\"}").
    		getJSONObject("expressionSRO").getJSONObject("user.shortListView.currentWishlist").
    		getJSONArray("value").getJSONArray(0).getJSONArray(0) ;
            System.out.println(pog.get(0));
            System.out.println(responseSro.getJSONObject("{\"type\":\"device\",\"value\":\"" + deviceId + "\"}").
		    		getJSONObject("expressionSRO").getJSONObject("user.shortListView.currentWishlist").
		    		getJSONArray("value").getJSONArray(0).get(0));
            System.out.println(responseSro.getJSONObject("{\"type\":\"device\",\"value\":\"" + deviceId + "\"}").
            		getJSONObject("expressionSRO").getJSONObject("user.shortListView.currentWishlist").
            		getJSONArray("value").getJSONArray(0).get(1));
            System.out.println(responseSro.getJSONObject("{\"type\":\"device\",\"value\":\"" + deviceId + "\"}").
            		getJSONObject("expressionSRO").getJSONObject("user.shortListView.currentWishlist").
            		getJSONArray("value").getJSONArray(0).get(2));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
