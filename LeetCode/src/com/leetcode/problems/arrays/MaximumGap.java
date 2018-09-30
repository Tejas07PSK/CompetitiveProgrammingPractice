/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 30 Sep, 2018, 1:52 AM,
        @File-Name : MaximumGap.java

 */

package com.leetcode.problems.arrays;

public class MaximumGap
{

    private class Bucket
    {

        private int minb = Integer.MAX_VALUE;
        private int maxb = Integer.MIN_VALUE;

    }

    public int maximumGap(int A[])
    {

        if ((A == null) || (A.length < 2))
        {

            return (0);

        }
        int maxl = Integer.MIN_VALUE, minl = Integer.MAX_VALUE, maxGap = Integer.MIN_VALUE, i = 0;
        for (int n : A)
        {

            minl = Math.min(minl, n);
            maxl = Math.max(maxl, n);

        }
        int buck_size = (int) Math.ceil((double) (maxl - minl) / (A.length - 1)), prev = minl;
        Bucket brs[] = new Bucket[A.length - 1];
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
