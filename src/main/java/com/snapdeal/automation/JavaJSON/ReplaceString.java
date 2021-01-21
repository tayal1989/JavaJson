package com.snapdeal.automation.JavaJSON;

import java.util.ArrayList;
import java.util.List;

public class ReplaceString {
	
	public void insertEntry(String tableName, List<String> parameterNames, List<String> parameterTypes,
			List<String> parameterValues) {
		String fields = "";
		for (int i = 0; i < parameterNames.size(); i++)
			fields = fields + parameterNames.get(i) + ((i != parameterNames.size() - 1) ? "," : "");

		String values = "";
		for (int i = 0; i < parameterValues.size(); i++)
			values = values + ((parameterTypes.get(i).equalsIgnoreCase("string")) ? "\"" : "") + parameterValues.get(i)
					+ ((parameterTypes.get(i).equalsIgnoreCase("string")) ? "\"" : "")
					+ ((i != parameterNames.size() - 1) ? "," : "");

		String query = "insert into " + tableName + " (" + fields + ") values (" + values + ");";
		System.out.println(query);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceString rs = new ReplaceString();

		//String value = "cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,search.max.results,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula";
		//String value = "search.max.results,cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula";
		//String value = "cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula,search.max.results";
//		String value = "search.max.results";
//		System.out.println(value);
//		String[] values = value.split(",");
//		String replaceVal = "";
//		
//		if(values.length > 1) {
//			if(value.contains("search.max.results,")) {
//				replaceVal = value.replace("search.max.results,", "");
//			} else if(value.endsWith("search.max.results")) {
//				replaceVal = value.replace(",search.max.results", "");
//			}
//		} else if(values.length == 1) {
//			replaceVal = value.replace("search.max.results", "");
//		}
//		
//		System.out.println("Val --> " + replaceVal);
//		
//		List<String> parameterNames = new ArrayList<String>();
//		parameterNames.add("name");
//		parameterNames.add("value");
//		
//		List<String> parameterTypes = new ArrayList<String>();
//		parameterTypes.add("string");
//		parameterTypes.add("string");
//		
//		List<String> parameterValues = new ArrayList<String>();
//		parameterValues.add("search.max.results");
//		parameterValues.add("500");
//		
//		rs.insertEntry("search_system_property", parameterNames, parameterTypes, parameterValues);
		
		//String value = "cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,search.max.results,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula";
		//String value = "search.max.results,cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula";
		//String value = "cache.key.pincode.enabled,cache.key.zone.enabled,subtract.from.max.score,dynamic.hpsa.sort.field,image.duplicates.min.dist,weighted.boost.formula,search.max.results";
		//String value = "search.max.results";
		//String value = "";
//		String value = "search.max.results,vishal.max.results,aman.max";
//		String[] values = value.split(",");
//		String replaceVal = "";
//		System.out.println(values.length);
//		
//		String recordName = "search.max.results";
//		
//		if(!value.contains(recordName)) {
//			if(value.isEmpty()) {
//				replaceVal = recordName;
//			} else if(values.length >= 1) {
//				replaceVal = replaceVal + value + "," + recordName;
//			} else if(values.length < 1) {
//				replaceVal = recordName;
//			}
//		} else {
//			replaceVal = value ;
//		}
//		
//		System.out.println(replaceVal);
		String value = "a=b|b=c";
		String[] values = value.split("|");
		String replaceVal = "";
		String defaultRecord = "default=band1";
		
		if(!value.contains(defaultRecord)) {
			if(value.isEmpty()) {
				replaceVal = defaultRecord;
			} else if(values.length >= 1) {
				replaceVal = replaceVal + value + "|" + defaultRecord;
			} else if(values.length < 1) {
				replaceVal = defaultRecord;
			}
		} else {
			replaceVal = value ;
		}
		
		System.out.println("Updated value for trending.search.cxe.modes ---> " + replaceVal);
	}

}
