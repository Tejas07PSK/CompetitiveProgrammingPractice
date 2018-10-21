/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Oct, 2018, 6:41 AM,
        @File-Name : VerifyPrime.java

 */

package com.ib.programming.math;

import java.lang.Math;

public class VerifyPrime
{

    public int isPrime(final int A)
    {

        if (A < 2)
        {

            return (0);

        }
        int limit = (int)Math.sqrt(A);
        for (int i = 2; i <= limit; i += 1)
        {

            if ((A % i) == 0)
            {

                return (0);

            }

        }
        return (1);

    }

}
