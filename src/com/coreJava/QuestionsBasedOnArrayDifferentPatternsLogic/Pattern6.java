package com.coreJava.QuestionsBasedOnArrayDifferentPatternsLogic;

import java.util.Scanner;

/**
 * Created by WrajendraG on 3/23/2017.
 */
public class Pattern6
{
    public static void main(String args[])
    {
        int count1 = 'A';
        char count = 'A';


        Scanner scanner =   new Scanner(System.in);
        System.out.print("\n\t\t\t Enter Number = ");
        int num =   Integer.parseInt(scanner.nextLine());

        for (int i =0;i<=num; i++)
        {
            for (int j = 0 ; j<=i ; j++)
            {
                System.out.print("\t"+count+"   "+count1);
                count++;
                count1++;
            }
            System.out.println();
        }

    }
}
/*
					 Enter Number = 10
	A 65
	B 66	C 67
	D 68	E 69	F 70
	G 71	H 72	I 73	J 74
	K 75	L 76	M 77	N 78	O 79
	P 80	Q 81	R 82	S 83	T 84	U 85
	V 86	W 87	X 88	Y 89	Z 90	[ 91	\ 92
	] 93	^ 94	_ 95	` 96	a 97	b 98	c 99	d 100
	e 101	f 102	g 103	h 104	i 105	j 106	k 107	l 108	m 109
	n 110	o 111	p 112	q 113	r 114	s 115	t 116	u 117	v 118	w 119
	x 120	y 121	z 122	{ 123	| 124	} 125	~ 126	 127	 128	�? 129	 130

* */