package com.pcwk.ex11.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class JsonToPersonMain {

	public static void main(String[] args) {
		
		//jsonString to Person
		String jsonString = "{\"name\":\"철수\",\"age\":9,\"gender\":\"남\"}";
		
		Gson gson = new Gson();
		
		Person person = gson.fromJson(jsonString, Person.class);
		
		System.out.println(person.toString());
		
		
		
		
		
		
		

	}

}
