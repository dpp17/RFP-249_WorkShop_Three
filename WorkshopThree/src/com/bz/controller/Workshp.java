package com.bz.controller;

import java.util.Scanner;

import com.bz.interfaces.IWorkshp;
import com.bz.model.WorshpPojo;
import com.bz.services.WorkshpImplementations;

/*
 Write a Java program to separate elements divided by 5 and stored into another new array from an integer array and 
  sort it in ascending order then remove divided by 5 from first array as well
 */
public class Workshp {
	
	static Scanner name = new  Scanner(System.in);
	
	void sortFindMultipleFive() {
		int[] intArray = new int[] {1,20,4,5,10,4,6,95};
		 int[] multipleFiveArray = new int[intArray.length];
		 
		 int j =0;
		 for(int i = 0; i < intArray.length; i++) {
			 if(intArray[i]%5==0) {
				 multipleFiveArray[j]=intArray[i];
				 j++;
			 } if(intArray[i]%5==0) {
				 intArray[i]=-1;
			 }
		}
		 
		 //ascending
		 for(int k = 0; k < intArray.length; k++) {
		 for(int i = 0; i < intArray.length; i++) {
				 if(intArray[i]>intArray[k]) {
					 int reserve = intArray[i];
					 intArray[i]= intArray[k];
					 intArray[k]=reserve;
				 }
//				 if(intArray[i]%5==0) {
//					 intArray[i]=-1;
				 }
			 }		 
		 //print multiple of five
		 System.out.print("multiple of five array :: [ ");
		 for(int i = 0; i < multipleFiveArray.length; i++) {
			 
			 if(multipleFiveArray[i] > 0) {
			 
				 System.out.print(multipleFiveArray[i]+", ");
			 }
			 }System.out.println("]"+'\n');

			 System.out.print("multiple of original array :: [ ");
			 for(int i = 0; i < intArray.length; i++) {
				 if(intArray[i]>=0) {
				 System.out.print(intArray[i]+", ");
				 }
				 }System.out.println("]"+'\n');
	}
	
	
	
	
	
	WorshpPojo getArray() {
		WorshpPojo array = new WorshpPojo();
		
		System.out.println("Enter ArrayLength::");
		int len = name.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter Array element :");
		for(int i = 0; i < len; i++) {
			arr[i]=name.nextInt();
		}
		
		array.setArr(arr);
		return array;
	}

	public static void main(String[] args) {

		Workshp arrObj = new Workshp();
		
		IWorkshp iWorkshp = new WorkshpImplementations();
		
		arrObj.sortFindMultipleFive();
		System.out.println("");
		iWorkshp.separateAndRemoveMultipleFive(arrObj.getArray());
	
	
	
	
	}
}


