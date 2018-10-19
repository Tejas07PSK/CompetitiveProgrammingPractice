/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 19 Oct, 2018, 9:00 PM,
        @File-Name : SumOfPairWiseHammingDistance.java

 */

package com.ib.programming.math;

public class SumOfPairWiseHammingDistance
{

    private final int factor = 1000000007;
    public int hammingDistance(final int [] A)
    {

        if ((A == null) || (A.length < 2))
        {

            return (0);

        }
        long dist = 0, c = 0;
        for (int i = 0; i < 32; i += 1)
        {

            c = 0;
            for (int j = 0; j < A.length; j += 1)
            {

                if ((A[j] & (1 << i)) == 0)
                {

                    c += 1;

                }

            }
            dist += (c * (A.length - c) * 2);

        }
        return ((int)(dist % factor));

    }

}
