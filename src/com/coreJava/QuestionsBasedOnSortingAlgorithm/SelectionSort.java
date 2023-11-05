package com.coreJava.QuestionsBasedOnSortingAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 1, 2, 5, 8, 30, 50, 80 };
		int pos = 0, temp;

		for (int i = 0; i < arr.length - 1; i++) {
			temp = arr[i];
			for (int j = i; j < arr.length; j++) 
			{
				if (temp > arr[j]) {
					temp = arr[j];
					pos = j;
				}
			}
			int temp1 = arr[i];
			arr[pos] = temp1;
			arr[i] = temp;
		}
		for (int i : arr)
			System.out.print(i + "   ");
	}

}
