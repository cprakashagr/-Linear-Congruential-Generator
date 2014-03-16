/**
 * 
 */
package com.cprakashagr;

/**
 * @author Chandra Prakash
 *
 */
public class LCG {

	double seed;
	int a;
	int c;
	int m;
	
	public LCG() {
		// TODO Auto-generated constructor stub
		seed	= Math.PI;
		a		= 65537;
		c		= 26493;
		m		= 16*4;
		myRandom();
	}
	
	public void myRandom() {
		
		int i=0;
		double lastNum = seed;
		for (i=0;i<100;i++) {
			lastNum = ((a*lastNum + c)%m)%m;
			System.out.println(lastNum);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LCG();
	}

}
