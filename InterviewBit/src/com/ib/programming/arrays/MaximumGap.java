/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 30 Sep, 2018, 1:52 AM,
        @File-Name : MaximumGap.java

 */

package com.ib.programming.arrays;

import java.util.List;
import java.util.Collections;

public class MaximumGap
{

    private class Bucket
    {

        private int minb = Integer.MAX_VALUE;
        private int maxb = Integer.MIN_VALUE;

    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List <Integer> A)
    {

        if ((A == null) || (A.size() < 2))
        {

            return (0);

        }
        int maxl = Collections.max(A), minl = Collections.min(A), maxGap = Integer.MIN_VALUE, i = 0;
        int buck_size = (int) Math.ceil((double) (maxl - minl) / (A.size() - 1)), prev = minl;
        Bucket brs[] = new Bucket[A.size() - 1];
        for (i = 0; i < brs.length; i += 1)
        {

            brs[i] = new Bucket();

        }
        for (int n : A)
        {

            if (n == minl || n == maxl)
            {

                continue;

            }
            brs[(n - minl) / buck_size].maxb = Math.max(n, brs[(n - minl) / buck_size].maxb);
            brs[(n - minl) / buck_size].minb = Math.min(n, brs[(n - minl) / buck_size].minb);

        }
        for (i = 0; i < brs.length; i += 1)
        {

            if ((brs[i].minb == Integer.MAX_VALUE) && (brs[i].maxb == Integer.MIN_VALUE))
            {

                continue;

            }
            maxGap = Math.max(maxGap, (brs[i].minb - prev));
            prev = brs[i].maxb;

        }
        maxGap = Math.max(maxGap, (maxl - prev));
        return (maxGap);

    }

}
