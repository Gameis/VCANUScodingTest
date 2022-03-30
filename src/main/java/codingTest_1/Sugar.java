package codingTest_1;

import org.json.simple.JSONObject;

public class Sugar extends Bread {
	String flour;
	String water;
	String sugar;
	
	public Sugar(JSONObject recipe) {
		flour = recipe.get("flour").toString();
		water = recipe.get("water").toString();
		sugar = recipe.get("sugar").toString();
	}

	@Override
	public void breadInfo() {
		System.out.println(" breadType: sugar");
		System.out.println(" recipe");
		System.out.println(" flour: " + flour);
		System.out.println(" water: " + water);
		System.out.println(" sugar: " + sugar);
		System.out.println();
	}
}
