package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic;

import java.util.Scanner;

/**
 * Created by rajendra on 13/4/17.
 */
public class PrintingDiamond
{
    public static void main(String  args[])
    {
        int n, c, k, space = 1;

        Scanner s=new Scanner(System.in);
        System.out.println("\n\t\t\tEnter number of rows: =  ");
        n=Integer.parseInt(s.nextLine());

        space = n - 1;

        for (k = 1; k<=n; k++)
        {
                for (c = 1; c<=space; c++)
                {
                    System.out.print(" ");
                }
                space--;

                for (c = 1; c<= ((2*k)-1); c++)
                {
                    System.out.print("*");
                }

                System.out.print("\n");
        }
        space = 1;

        for (k = 1; k<= n - 1; k++)
        {
            for (c = 1; c<= space; c++)
            {
                System.out.print(" ");
            }
            space++;

            for (c = 1 ; c<= 2*(n-k)-1; c++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }

}

