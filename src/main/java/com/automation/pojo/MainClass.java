package com.automation.pojo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String genreJson = IOUtils.toString(new FileReader("Unlimint.json"));
		Gson gson = new Gson();
        JsonFile jsonFile = gson.fromJson(genreJson, JsonFile.class);
        
        String firstName = jsonFile.getResults().get(0).getName().getFirst();
        String lastName = jsonFile.getResults().get(0).getName().getLast();
        String email = jsonFile.getResults().get(0).getEmail();
        String password = jsonFile.getResults().get(0).getLogin().getPassword();
        String city = jsonFile.getResults().get(0).getLocation().getCity();
        String country = jsonFile.getResults().get(0).getLocation().getCountry();
        int zipcode = jsonFile.getResults().get(0).getLocation().getPostcode();
        String phoneNumber = jsonFile.getResults().get(0).getPhone();
        
        System.out.println("First name is : " + firstName);
    	System.out.println("Last name is : " + lastName);
    	System.out.println("Email is : " + email);
    	System.out.println("Password is : " + password);
    	System.out.println("City is : " + city);
    	System.out.println("Country is : " + country);
    	System.out.println("Zipcode is : " + zipcode);
    	System.out.println("Phone Number is : " + phoneNumber);
	}

}
