package com.greatlearning.lab2.service;

import java.util.Scanner;


public class Transaction {
	
	static int size,targetNo;
	static int[] arr;
	Scanner sc = new Scanner(System.in);
	public void getValue() {

			System.out.println("Enter the size of transaction array");
			size = sc.nextInt();
			arr = new int[size];
			
			System.out.println("Enter the value of array");
			for(int i=0;i<size;i++) {
			 arr[i] = sc.nextInt();
			}	
	}
	
	public void targetValue() {
			System.out.println("Enter the total no of targets that needs to be achieved");		
			targetNo = sc.nextInt();
		
			while(targetNo-- != 0) {
			int flag = 0;
			
			System.out.println("Enter the value of target");
			long target = sc.nextLong();
			long sum=0;
			int count=0;
			for(int i=0;i<size;i++) {
				sum += arr[i];
				count++;
			
				if(sum>=target) {
					System.out.println("Target achieved after "+count +" transactions");
					flag=1;
					break;
					}
				}
				if(flag==0) {
					System.out.println("Given target is not achieved");
					break;
				}
			}
		}
	}