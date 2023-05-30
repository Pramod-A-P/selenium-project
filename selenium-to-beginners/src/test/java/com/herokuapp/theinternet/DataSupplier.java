package com.herokuapp.theinternet;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	@DataProvider
	public String[] dp1() {
		String[] data =new String[] {
				"test1",
				"test2",
				"test3",
				"test4"
		};
		return data;
	}
}
