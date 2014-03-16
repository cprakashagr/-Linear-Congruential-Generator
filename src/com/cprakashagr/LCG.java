package com.cprakashagr;

/**
 * @author Chandra Prakash
 * @date March' 16th, 2014.
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
		
		/*
		 * Conditions (Not necessary, but important if LCG is considered.): 
		 * 1. if m is divisible by 4, then a-1 is also divisible by 4.
		 */
		generateRandom();
	}
	
	public double myRandom(int start, int end, double last) {
		
		double lastNum;
		
		lastNum= last==0?seed:last;
		lastNum = start + (((a*lastNum + c)%m)%m)%end;
		
		return lastNum;
	}
	
	public void uniformityCheck() {
		
		//  Uniformity on the basis of numbers generated between 0 and 25, by checking the number of occurrence for each one of them.
		
	}
	
	public void generateRandom() {
		
		int i;
		double last = 0;
		
		for (i=0;i<100;i++) {
			last = myRandom(0,100,last);
			System.out.println(last);
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
