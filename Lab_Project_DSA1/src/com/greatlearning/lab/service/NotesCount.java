package com.greatlearning.lab.service;

public class NotesCount {

	public void notesCount(int[] arr, int amount) throws Exception {
		int i=0;
		int[] counter = new int[arr.length];
		// TODO Auto-generated method stub
		try {
			if(amount==0) {
				System.out.println("Enter valid amount");
			}else {
			for(i=0;i<arr.length;i++) {
				if(amount>=arr[i]) {
					counter[i]= amount/arr[i];
					amount -= arr[i]*counter[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact denomination cannot be achieved");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(i=0;i<arr.length;i++) {
					if(counter[i]!=0) {
						System.out.println(arr[i]+":"+counter[i]);
					}
				}
			}
		}
	}
		catch(ArithmeticException e){
			System.out.println("0 is not a valid denomination");
		}
/**	 //Alternate code that would work, but will increase time complexity, i assume.	
		int count=0,denomination=0;
		if (amount==0) {
			System.out.println("Enter valid amount");
		}
		else {
		System.out.println("Your payment approach in order to give min no of notes will be");
		}
			while(amount != 0 && i<arr.length) {
			if(arr[i]<=amount) {
				denomination = arr[i];
				amount = amount-arr[i];
				count++;
				}
			if(arr[i]>amount && count!=0) {
				System.out.println(denomination+":"+count);
				count=0;}
			if(count==0) {
				i++;
			}
		}
			if(amount>0) {
				System.out.println("Exact denomination cannot be achieved");
			}**/
	}
}
