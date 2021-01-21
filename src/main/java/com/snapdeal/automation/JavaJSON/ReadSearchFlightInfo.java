package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;
import java.util.Iterator;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReadSearchFlightInfo {

	public static void main(String[] args) {
		 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("SearchFlight.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println("Code : " + jsonObject.get("searchToken").toString());
            JSONArray jsonArray = (JSONArray)jsonObject.get("searchProviders");
            System.out.println(jsonArray.get(0));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
