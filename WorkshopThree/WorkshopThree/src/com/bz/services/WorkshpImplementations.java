package com.bz.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bz.interfaces.IWorkshp;
import com.bz.model.WorshpPojo;

public class WorkshpImplementations implements IWorkshp{

	static Scanner name = new Scanner(System.in);
	static ArrayList<Integer> arrListHouse = new ArrayList<Integer>();
	

	public void separateAndRemoveMultipleFive(WorshpPojo arr) {
		int[] intArray = arr.getArr();
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

	@Override
	public void sortAndFilter() {
		arrListHouse.add(12);
		arrListHouse.add(11);
		arrListHouse.add(5);
		arrListHouse.add(13);
		arrListHouse.add(20);
		arrListHouse.add(30);
		
		System.out.println("Multiples of five ::");
		arrListHouse.stream().filter(data-> data%5 == 0).forEach(data->System.out.print(data+", "));
		System.out.println();
		System.out.println("sorted and filtered array ::");
		arrListHouse.stream().filter(data-> data%5 != 0).sorted().forEach(data-> System.out.print(data+", "));
		
		
	}




























	

}
