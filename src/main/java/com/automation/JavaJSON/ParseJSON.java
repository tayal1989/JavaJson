package com.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class ParseJSON {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("FindSUPC.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            JSONArray jsonarr= jsonObject.getJSONArray("pogDetailSROs");
            for(int i=0; i<jsonarr.length(); i++){
            	long pogID = jsonarr.getJSONObject(i).getLong("id") ;
            	String pogIDStr = Long.toString(pogID) ;
            	if(pogIDStr.equalsIgnoreCase("1520841809")) {
            		JSONArray offerJson = jsonarr.getJSONObject(i).getJSONArray("offers");
                	
            		
            		
	                	for (int j = 0 ; j < offerJson.length() ; j++) {
	                		System.out.println(offerJson.getJSONObject(j).getJSONArray("supcs").get(0));
	                		if(offerJson.getJSONObject(j).getJSONArray("supcs").get(0).equals("SDL012020181")) {
		                		System.out.println(offerJson.getJSONObject(j).get("catalogStatus"));
		                		System.out.println(offerJson.getJSONObject(j).get("productState"));
		                		System.out.println(offerJson.getJSONObject(j).get("productStatus"));
	                		}
	                	}
            		
            	}
            }            
            
//            for(int i = 0 ; i < jsonarr.length() ; i++) {
//            	System.out.println(jsonarr.get(i));
//            }

//            for(int i=0; i<jsonarr.length(); i++){
//            	System.out.println(jsonarr.getJSONObject(i).get("id"));
//            	JSONArray jsonOffer = jsonarr.getJSONObject(i).getJSONArray("offers");
//            	System.out.println(jsonOffer.length());
//            	
//            	for(int j=0; j<jsonOffer.length(); j++){
//                	System.out.println("=====>" + jsonOffer.getJSONObject(j).get("supcs"));
//            	}
//            }
 
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
