package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Random r = new Random();
		Stream<Integer> strm1 = Stream.generate(()->r.nextInt(10)).limit((10));
		int res=strm1.reduce(0,(a,e)->a+e);
		System.out.println(res);
	}

}
