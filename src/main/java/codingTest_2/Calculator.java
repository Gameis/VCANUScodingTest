package codingTest_2;

public class Calculator {
	int total = 0;
	
	public Calculator add(int num) {
		total += num;
		return this;
	}
	
	public Calculator subtract(int num) {
		total -= num;
		return this;
	}
	
	public int out() {
		return total;
	}
}
