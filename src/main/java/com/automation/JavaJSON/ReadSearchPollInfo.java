package com.automation.JavaJSON;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class ReadSearchPollInfo {

	public static void main(String[] args) {
		 
        try {
        	String genreJson = IOUtils.toString(new FileReader("SearchPoll.json"));
            ArrayList<String> airlineType = new ArrayList<String>();
            HashMap<String, Integer> innerHmap = new HashMap<String, Integer>();            
            JSONObject jsonObject = new JSONObject(genreJson);
            
            JSONObject groupedFares = jsonObject.getJSONObject("results").getJSONObject("1026").
            		getJSONObject("comR").getJSONObject("groupedFares") ;
            Map<String, Object> list = groupedFares.toMap();            
            Iterator <String> it = list.keySet().iterator();  
            while(it.hasNext()) {  
	            String key=(String)it.next();
	            airlineType.add(key);
            }
            
            for(int i = 0 ; i < airlineType.size() ; i++) {       	
            	Iterator <String> it1 = groupedFares.getJSONObject(airlineType.get(i)).keySet().iterator();
            	while(it1.hasNext()) {
            		String key=(String)it1.next();
            		
            		Iterator <String> it2 = groupedFares.getJSONObject(airlineType.get(i)).
                			getJSONObject(key).keySet().iterator();
            		while(it2.hasNext()) {
            			String key1=(String)it2.next();
            			
            			if(key1.equalsIgnoreCase("total")) {
            				String totalAmount = groupedFares.getJSONObject(airlineType.get(i)).
                        			getJSONObject(key).get(key1).toString().trim() ;
							System.out.println(airlineType.get(i) + "-->" + key + "-->" + /* key1 + "-->" + */ 
            						totalAmount);
							double flightCost = Double.parseDouble(totalAmount);
							int total = (int) flightCost ;
							innerHmap.put(airlineType.get(i) + "=" + key, total);
            			}
            		}
            	}
            	System.out.println();
            	
            }
            
            Map<String, Integer> hm1 = sortByValue(innerHmap); 
            
            // print the sorted hashmap 
            for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
                System.out.println(en.getKey() + "-->" + en.getValue()); 
            } 
        
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
	
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}
