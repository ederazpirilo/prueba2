package Repaso;

public class calculadora {

	public static void main(String[] args) {


	}
	public calculadora(int num1, int num2) {
		
	}

	public int resta(int num1, int num2) {
		int result;
		if(resta2(num1, num2)) result=num1-num2;
		else result=num2-num1;
		
		return (result);
	}
	
	public boolean resta2(int num1, int num2) {
		if(num1>=num2) return true;
		else return false;
	}
	
	public Integer divide2(int num1, int num2) {
		if(num2==0) return null;
		int result = num1/num2;
		return (result);
	}
}
