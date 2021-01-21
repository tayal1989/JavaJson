package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class AdidasAPI {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("AvailablePetStatus.json"));            
            JSONArray jsonarray = new JSONArray(genreJson);
            for (int i = 0; i < jsonarray.length(); i++) {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                String status = jsonobject.getString("status");
                System.out.println(status);
            } 
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
