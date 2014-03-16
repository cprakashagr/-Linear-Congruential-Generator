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
		seed	= Math.PI;	//Starting Number
		a		= 65537;	//Multiplier
		c		= 12493;	//Increment
		m		= 2*80;		//Modulus
		
		/*
		 * Conditions (Not necessary, but important if LCG is considered.): 
		 * 1. if m is divisible by 4, then a-1 is also divisible by 4.
		 */
//		generateRandom();
		uniformityCheck();
	}
	
	public double myRandom(int start, int end, double last) {
		
		double lastNum;
		
		lastNum = last==0?seed:last;
		lastNum = start + (((a*lastNum + c)%m)%m)%end;
		
		return lastNum;
	}
	
	public void uniformityCheck() {
		
		//  Uniformity on the basis of numbers generated between 0 and 10, by checking the number of occurrence for each one of them.
		int[] ranNum = new int[10];
		int i=0;
		double last = 0;
		
		for (i=0;i<10;i++)
			ranNum[i] = 0;
		
		// Iterations: 100
		for (i=0;i<100;i++) {
			last = myRandom(0, 10, last);
			int intLast = (int) last;
			
			if (ranNum[intLast] > 0)
				ranNum[intLast] += 1;
			else
				ranNum[intLast] = 1;
			
			//System.out.println(last + " - " + intLast + " - " + ranNum[intLast]);
		}
		
		for (i=0;i<10;i++)
			System.out.println(ranNum[i]);
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
