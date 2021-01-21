package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class AdidasAddPet {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("AddPetJsonResponse.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println(jsonObject.get("status"));
 
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
