package codingTest_1;

import org.json.simple.JSONObject;

public class VendingMachine extends BreadFactory{

	@Override
	public Bread create(JSONObject jsonObject) {
		
		String breadType = jsonObject.get("breadType").toString();
//		double flour = (double)((JSONObject)jsonObject.get("recipe")).get("flour");
//		double water = (double)((JSONObject)jsonObject.get("recipe")).get("flour");
//		double data = (double)((JSONObject)jsonObject.get("recipe")).get("flour");
		switch (breadType) {
			case "cream" :
				return new Cream((JSONObject)jsonObject.get("recipe"));
			case "sugar" :
				return new Sugar((JSONObject)jsonObject.get("recipe"));
			case "butter" :
				return new Butter((JSONObject)jsonObject.get("recipe"));
			default :
				throw new RuntimeException(breadType + " is not existed");
		
		}
	}
	
}
