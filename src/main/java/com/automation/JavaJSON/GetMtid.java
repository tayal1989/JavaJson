package com.automation.JavaJSON;

import java.io.FileReader;
import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class GetMtid {
    public static void main(String[] args) {
 
        try {
            
            String genreJson = IOUtils.toString(new FileReader("Mtid.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println(jsonObject.getJSONObject("result").get("_id"));
 
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
