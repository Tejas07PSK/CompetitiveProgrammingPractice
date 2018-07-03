package com.hackerearth.beginner;

import java.util.Scanner;

public class SumOfFour
{

    public static void main(String[] args)
    {

        int [] numArray = new int[4];
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 4; i++)
        {

            numArray[i] = s.nextInt();
            sum += numArray[i];

        }
        System.out.print(sum);
        s.close();

    }

}
