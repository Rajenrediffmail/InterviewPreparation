package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic;

import java.util.Scanner;
public class Dimand {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter Dimand length in Number");
int num = sc.nextInt();
		int i,space,k;

System.out.println("Print half of the dimand ");
		for(i=1 ; i<=num ; i++)
		{
					for(space=num-1; space>=i; space--)
					{
						System.out.print(" ");

					}
					
					
					for(k=1;k<=(2*i-1);k++)
					{

						System.out.print("*");
					}

					System.out.println();


		}

		 for(i=num;i>=1;i--)  // imp
		 {
					 for(space=num-1;   space>=i;   space--) // imp
					 {
					 System.out.print(" ");
					 }
					 for( k=1;  k<=(i*2-1);  k++) // imp
					 {
					 System.out.print("*");
					 }
				 	System.out.println();
		 }
		 sc.close();
	}


}
/*

 Enter Dimand length in Number
10
Print half of the dimand
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

  */
