package com.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class ReadPOGFromAerospike {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("FindSUPC.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            JSONArray jsonarr= jsonObject.getJSONArray("data");
            for(int i=0; i<jsonarr.length(); i++){
            	System.out.println(jsonarr.getJSONObject(i).get("pogId"));
            }
 
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
