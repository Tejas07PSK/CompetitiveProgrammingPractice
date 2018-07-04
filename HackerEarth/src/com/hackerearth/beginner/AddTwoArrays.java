/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 4 JUL, 2018, 1:47:53 AM
        @File-Name : AddTwoArrays.java

 */

package com.hackerearth.beginner;

import java.util.Scanner;

public class AddTwoArrays
{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int N = 0;
        while (true)
        {

            N = s.nextInt();
            if ((N >= 1) && (N <= 100))
                break;

        }
        int[] numArrayA = new int[N];
        int[] numArrayB = new int[N];
        int[] sumArray = new int[N];
        for (int i = 0; i < N; i++)
        {

            numArrayA[i] = s.nextInt();
            numArrayB[i] = s.nextInt();
            sumArray[i] = numArrayA[i] + numArrayB[i];

        }
        for (int i = 0; i < N; i++)
            System.out.print(sumArray[i] + " ");
        System.out.println();

    }

}
