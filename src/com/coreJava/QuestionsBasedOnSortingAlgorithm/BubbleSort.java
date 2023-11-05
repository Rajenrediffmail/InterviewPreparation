package com.coreJava.QuestionsBasedOnSortingAlgorithm;

public class BubbleSort {

	int[] bubbleSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length - 1; j++) 
			{
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;

	}

	public static void main(String args[]) {
		int arr[] = { 10, 5, 2, 20, 40, 30, 1, 2, 3 };
		BubbleSort obj = new BubbleSort();
		int sort[] = obj.bubbleSort(arr);
		for (int i : sort)
			System.out.print(i + "   ");
	}
}
