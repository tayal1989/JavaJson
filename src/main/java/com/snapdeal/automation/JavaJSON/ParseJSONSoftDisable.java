package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class ParseJSONSoftDisable {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("SoftDisable.json"));
            
            JSONObject jsonObject = new JSONObject(genreJson);
            
            JSONObject jData = jsonObject.getJSONObject("supcToInventoryPricingMap").getJSONObject("{\"supc\":\"" 
            + "SDL880551444" + "\",\"sellerCode\":\"" + "aace21" + "\"}") ;
            
            System.out.println(jData.get("softDisable"));
			/*
			 * JSONArray jsonarr= jsonObject.getJSONArray("pogDetailSROs");
			 * System.out.println(jsonarr.length());
			 * 
			 * for(int i=0; i<jsonarr.length(); i++){
			 * System.out.println(jsonarr.getJSONObject(i).get("id")); JSONArray jsonOffer =
			 * jsonarr.getJSONObject(i).getJSONArray("offers");
			 * System.out.println(jsonOffer.length());
			 * 
			 * for(int j=0; j<jsonOffer.length(); j++){ System.out.println("=====>" +
			 * jsonOffer.getJSONObject(j).get("supcs")); } }
			 */
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
