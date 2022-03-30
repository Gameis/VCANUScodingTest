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
import codingTest_2.Calculator;

public class CodingTest_main {

    public static void main(String[] args) {
    	//---------------------1번문제-----------------------------------
    	
//		JSONParser parser = new JSONParser(); 
//		try { 
//		    FileReader reader = new FileReader("c:/bread/bread.json"); 
//		    
//		    List obj = (List) parser.parse(reader);    //데이터가 리스트 안에 들어가 있어서 반복문으로 뽑아서 변환합니다
//		    for(Object item : obj) {
//		        JSONObject jsonObject = (JSONObject) item;
//		        JSONObject recipe = (JSONObject)jsonObject.get("recipe");
//		        
//		        BreadFactory breadFactory = new VendingMachine();
//		        Bread bread = breadFactory.create(jsonObject);    //breadType에 따른 클래스 생성
//		        
//		        bread.breadInfo();    //빵 정보 출력~
//		    }
//		    reader.close(); 
//		} 
//		catch (IOException | ParseException e) { 
//		    e.printStackTrace(); 
//		}
    	
    	//---------------------1번문제-----------------------------------
    	//---------------------2번문제-----------------------------------
    	
//		Calculator calculator = new Calculator();
//		int result = calculator.add(4).add(5).subtract(3).out();
//		System.out.println(result);
      
    	//---------------------2번문제-----------------------------------
    	//---------------------3번문제-----------------------------------
//    	int result = factorial(4);
//    	System.out.println(result);
    	//---------------------3번문제-----------------------------------
    	//---------------------4번문제-----------------------------------
    	
//    	int result = factorial(25);
//    	System.out.println(result);
    	//---------------------4번문제-----------------------------------
    	//---------------------5번문제-----------------------------------

    	int[][] pond = {
    			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    			{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
    			{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
    			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
    			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
    			{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
    			{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
    			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    	};
    	
    	boolean count = true;
    	
    	while(count) {
    		count = false;
    		for(int i = 0; i < pond.length; i++) {
        		if(i - 1 < 0 || i + 1 >= pond.length)
        			continue;
        		for(int j = 0; j < pond[i].length; j++) {
        			
        			if(j - 1 < 0 || j + 1 >= pond[i].length || pond[i][j] == 0)
            			continue;
        			
        			if(pond[i-1][j] >= pond[i][j] 
        					&& pond[i+1][j] >= pond[i][j] 
        							&& pond[i][j-1] >= pond[i][j] 
        									&& pond[i][j+1] >= pond[i][j]) {
        				pond[i][j]++;
        				count = true;
        			}
        		}
        	}
    	}
    	
    	
    	
    	for(int i = 0; i < pond.length; i++) {
    		for(int j = 0; j < pond[i].length; j++) {
    			System.out.print(" " + pond[i][j] + " ");
    		}
    		
    		System.out.println();
    	}
    	//---------------------5번문제-----------------------------------
    }
    
    //3번문제
//    public static int factorial(int num) {
//    	if(num - 1 == 0)
//    		return num;
//    	return num * factorial(num-1);
//    }
    
    //4번문제
//    public static int factorial(int num) {
//    	int [] fact = new int[num + 1];
//    	
//    	fact[0] = 1;
//    	fact[1] = 1;
//    	
//    	for(int i = 1; i <= num; i++) {
//    		fact[i] = i * fact[i-1];
//    	}
//    	
//    	return fact[num];
//    }
}