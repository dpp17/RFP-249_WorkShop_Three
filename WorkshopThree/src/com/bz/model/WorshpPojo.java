package com.bz.model;

public class WorshpPojo {

	private int[] arr;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	
	
	
	
	public String toString() {
		return "WorshpPojo [arr=" + (arr != null ? arrayToString(arr, arr.length) : null) + "]";
	}

	private String arrayToString(Object array, int len) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < len; i++) {
			if (i > 0)
				buffer.append(", ");
			if (array instanceof int[])
				buffer.append(((int[]) array)[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
	
}
