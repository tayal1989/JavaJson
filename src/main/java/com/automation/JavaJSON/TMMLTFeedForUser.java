package com.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class TMMLTFeedForUser {
    public static void main(String[] args) {
 
        try {            
            String genreJson = IOUtils.toString(new FileReader("TMMLTFeedForUser.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            JSONArray jsonarr= jsonObject.getJSONArray("widgets");
            for(int i=0; i<jsonarr.length(); i++){
        		JSONArray offerJson = jsonarr.getJSONObject(i).getJSONArray("products");
            	for (int j = 0 ; j < offerJson.length() ; j++) {
            		System.out.println(offerJson.getJSONObject(j).get("pogId"));
            	}
            }
 
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
