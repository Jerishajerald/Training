package com.training;

import java.util.Arrays;

public class Permutation {
	
	private String[] str;

	public Permutation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permutation(String[] str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Permutation [str=" + Arrays.toString(str) + "]";
	}

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	

}
