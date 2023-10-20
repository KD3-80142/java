package com.sunbeam;

public interface Emp {
	
	double getSal();
	
	default double calcIncentives() {
	return 0.0;
   }
	static double calcTotalIncome(Emp arr[]) {
		double TotalIncome=0.0;
		for(Emp ele:arr)
		{
			double totalSal = ele.getSal() + ele.calcIncentives();
			TotalIncome = TotalIncome + totalSal;
		}
		return TotalIncome;
	}
}
