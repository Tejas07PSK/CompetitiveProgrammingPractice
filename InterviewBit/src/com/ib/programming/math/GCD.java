/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 24 Oct, 2018, 11:33 PM,
        @File-Name : GCD.java

 */

package com.ib.programming.math;

public class GCD
{

    public int gcd(int A, int B)
    {

        if (A < B)
        {

            int temp = A;
            A = B;
            B = temp;

        }
        if (B == 0)
        {

            return (A);

        }
        int r = 0;
        while (B != 0)
        {

            r = A % B;
            A = B;
            B = r;

        }
        return (A);

    }

}
