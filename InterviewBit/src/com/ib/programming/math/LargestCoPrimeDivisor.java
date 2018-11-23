/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 23 Nov, 2018, 5:20 AM,
        @File-Name : LargestCoPrimeDivisor.java

 */

package com.ib.programming.math;

public class LargestCoPrimeDivisor
{

    private static int gcd(int A, int B)
    {

        int temp = 0;
        if (B > A)
        {

            temp = A;
            A = B;
            B = temp;

        }
        while ((A % B) != 0)
        {

            temp = A % B;
            A = B;
            B = temp;


        }
        return (B);

    }

    public int cpFact(int A, int B)
    {

        int hcf = gcd(A, B);
        while (hcf != 1)
        {

            A = A/hcf;
            hcf = gcd(A, B);

        }
        return (A);

    }

}
