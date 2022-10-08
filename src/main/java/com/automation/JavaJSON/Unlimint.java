package com.automation.JavaJSON;

import java.io.FileReader;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class Unlimint {

	public static void main(String[] args) {
		try {
            
            String genreJson = IOUtils.toString(new FileReader("Unlimint.json"));            
            JSONObject jsonObject = new JSONObject(genreJson);
            JSONArray jsonarr= jsonObject.getJSONArray("results");

            for(int i=0; i<jsonarr.length(); i++){
            	String firstName = jsonarr.getJSONObject(i).getJSONObject("name").getString("first");
            	String lastName = jsonarr.getJSONObject(i).getJSONObject("name").getString("last");
            	String email = jsonarr.getJSONObject(i).getString("email");
            	String password = jsonarr.getJSONObject(i).getJSONObject("login").getString("password");
            	String city = jsonarr.getJSONObject(i).getJSONObject("location").getString("city");
            	String country = jsonarr.getJSONObject(i).getJSONObject("location").getString("country");
            	int zipcode = jsonarr.getJSONObject(i).getJSONObject("location").getInt("postcode");
            	String phoneNumber = jsonarr.getJSONObject(i).getString("phone");
            	System.out.println("First name is : " + firstName);
            	System.out.println("Last name is : " + lastName);
            	System.out.println("Email is : " + email);
            	System.out.println("Password is : " + password);
            	System.out.println("City is : " + city);
            	System.out.println("Country is : " + country);
            	System.out.println("Zipcode is : " + zipcode);
            	System.out.println("Phone Number is : " + phoneNumber);
            } 
        } catch (Exception e) {
            System.out.println("Error");
        }

	}

}
