package codingTest_main;

import java.io.FileReader; 
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser; 
import org.json.simple.parser.ParseException;

import codingTest_1.Bread;
import codingTest_1.BreadFactory;
import codingTest_1.VendingMachine;

public class codingTest_main {

	public static void main(String[] args) {
		//---------------------1번문제-----------------------------------
		JSONParser parser = new JSONParser(); 
		try { 
			FileReader reader = new FileReader("c:/bread/bread.json"); 
			
			List obj = (List) parser.parse(reader);	//데이터가 리스트 안에 들어가 있어서 반복문으로 뽑아서 변환합니다
			for(Object item : obj) {
				JSONObject jsonObject = (JSONObject) item;
				JSONObject recipe = (JSONObject)jsonObject.get("recipe");
				
				BreadFactory breadFactory = new VendingMachine();
				Bread bread = breadFactory.create(jsonObject);	//breadType에 따른 클래스 생성
				
				bread.breadInfo();	//빵 정보 출력~
			}
			reader.close(); 
		} 
		catch (IOException | ParseException e) { 
			e.printStackTrace(); 
		}

	}

}
