package cn.itcast.test;

import java.math.BigDecimal;

public class StrictfpClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float aFloat = 0.6710339f;

		double aDouble = 0.04150553411984792d;

		double sum = aFloat + aDouble;

		float quotient = (float) (aFloat / aDouble);

		System.out.println("float: " + aFloat);

		System.out.println("double: " + aDouble);

		System.out.println("sum: " + sum);

		System.out.println("quotient: " + quotient);
		System.out.println(getResult());
	}
	
	public static BigDecimal  getResult(){
		double a=1.0d;
		
		float b=0.1f;
		return (new BigDecimal("1").subtract(new BigDecimal("0.1")));
	}


}
