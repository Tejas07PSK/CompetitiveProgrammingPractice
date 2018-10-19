/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 19 Oct, 2018, 9:00 PM,
        @File-Name : SumOfPairWiseHammingDistance.java

 */

package com.ib.programming.math;

import java.util.List;

public class SumOfPairWiseHammingDistance
{

    private final int factor = 1000000007;

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List <Integer> A)
    {

        if (A == null)
        {

            return (0);

        }
        long n = A.size();
        if (n < 2)
        {

            return (0);

        }
        long dist = 0, c = 0;
        for (int i = 0; i < 32; i += 1)
        {

            c = 0;
            for (int j = 0; j < n; j += 1)
            {

                if ((A.get(j) & (1 << i)) == 0)
                {

                    c += 1;

                }

            }
            dist += (c * (n - c) * 2);

        }
        return ((int)(dist % factor));

    }

}
