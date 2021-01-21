package com.snapdeal.automation.JavaJSON;

import java.io.FileReader;

import org.json.JSONObject;

import org.apache.commons.io.IOUtils;
 
/**
 * @author Vishal Agarwal
 */
 
public class VikasTimer {
    public static void main(String[] args) {
 
        try {            
            String genreJson = IOUtils.toString(new FileReader("VikasTimer.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            System.out.println("Timer State Response --> " + jsonObject.getJSONObject("data").getJSONObject("668793589419").getString("timer_state"));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
