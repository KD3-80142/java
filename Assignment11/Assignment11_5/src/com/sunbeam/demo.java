package com.sunbeam;
interface Check<T>
{
	boolean compare(T x,T y);
}
public class demo {
	static<T> int countIf(T[]arr,T key,Check<T>c) {
		int  cnt =0;
		for (T t : arr) {
			if(c.compare(t, key))
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Double [] arr= {1.1,2.1,1.1,1.5,7.5,7.5};
            Integer  p= countIf(arr,1.1,(x,y)->x.equals(y));
            System.out.println(p);
	}

}
