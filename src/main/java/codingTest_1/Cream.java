package codingTest_1;

import org.json.simple.JSONObject;

public class Cream extends Bread {
	String flour;
	String water;
	String cream;
	
	public Cream(JSONObject recipe) {
		flour = recipe.get("flour").toString();
		water = recipe.get("water").toString();
		cream = recipe.get("cream").toString();
	}

	@Override
	public void breadInfo() {
		System.out.println(" breadType: cream");
		System.out.println(" recipe");
		System.out.println(" flour: " + flour);
		System.out.println(" water: " + water);
		System.out.println(" cream: " + cream);
		System.out.println();
	}

}
