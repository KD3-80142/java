package com.sunnbeam;

import java.util.*;
import java.util.stream.Stream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Stream<Integer> strm1 = Stream.iterate(1,i->i+1).limit(6);
		int res=strm1.reduce(1,(a,e)->a*e);
		System.out.println(res);
	}

}
