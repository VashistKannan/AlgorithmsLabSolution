package com.greatlearning.lab.driver;
import java.util.Scanner;

import com.greatlearning.lab.service.MergeSort;
import com.greatlearning.lab.service.NotesCount;
public class Main {
	
	public static void main(String[] args) throws Exception {
		int size,amount;
		int[] notes;
		Scanner sc = new Scanner(System.in);
		MergeSort ms = new MergeSort();
		NotesCount ns = new NotesCount();
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		notes= new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i =0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		amount=sc.nextInt();
		ms.mergeSort(notes, 0, notes.length-1);
		ns.notesCount(notes,amount);

		sc.close();
	}

}
