package com.hackerearth.beginner;

import java.util.Scanner;

public class SumOfSqN
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
        int[] numArray = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++)
        {

            numArray[i] = s.nextInt();
            sum += numArray[i] * numArray[i];

        }
        System.out.print(sum);
        s.close();

    }

}
