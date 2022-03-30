package codingTest_1;

import org.json.simple.JSONObject;

public class Butter extends Bread {
	String flour;
	String water;
	String butter;
	
	public Butter(JSONObject recipe) {
		flour = recipe.get("flour").toString();
		water = recipe.get("water").toString();
		butter = recipe.get("butter").toString();
	}

	@Override
	public void breadInfo() {
		System.out.println(" breadType: butter");
		System.out.println(" recipe");
		System.out.println(" flour: " + flour);
		System.out.println(" water: " + water);
		System.out.println(" butter: " + butter);
		System.out.println();
	}	
}
