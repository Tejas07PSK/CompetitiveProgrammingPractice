/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 4 JUL, 2018, 1:47:53 AM
        @File-Name : NumbersInRange.java

 */

package com.hackerearth.beginner;

import java.util.Scanner;

public class NumbersInRange
{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int L = 0;
        int R = 0;
        while (true)
        {

            L = s.nextInt();
            R = s.nextInt();
            if (((L >= 1) && (L <= 100)) && ((R >= 1) && (R <= 100)))
                break;

        }
        for(int i = L; i <= R; i++)
            System.out.print(i + " ");
        System.out.println();
        s.close();

    }

}
