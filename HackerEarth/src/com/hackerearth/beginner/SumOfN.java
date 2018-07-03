/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 4 JUL, 2018, 1:47:53 AM
        @File-Name : SumOfN.java

 */

package com.hackerearth.beginner;

import java.util.Scanner;

public class SumOfN
{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int[] numArray = new int[s.nextInt()];
        int sum = 0;
        for (int i = 0; i < numArray.length; i++)
        {

            numArray[i] = s.nextInt();
            sum = sum + numArray[i];

        }
        System.out.print(sum);
        s.close();

    }

}