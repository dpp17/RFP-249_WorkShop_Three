package com.bz.services;

import com.bz.interfaces.IWorkshp;
import com.bz.model.WorshpPojo;

public class WorkshpImplementations implements IWorkshp{

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

}
