/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 26 Sep, 2018, 7:01 PM,
        @File-Name : MaximumUnsortedSubarray.java

 */

package com.ib.programming.arrays;

public class MaximumUnsortedSubarray
{

    public int [] subUnsort(final int A [])
    {

        if ((A == null ) || (A.length == 1))
        {

            return (new int [] {-1});

        }
        int i = 0, j = 0, s = -1, e = -1, min_intr = 0, max_intr = 0;
        for (i = 0, j = (A.length - 1); i < (A.length - 1); i += 1, j -= 1)
        {

            if ((s < 0) && (A[i] > A[i + 1]))
            {

                s = i;

            }
            if ((e < 0) && (A[j] < A[j - 1]))
            {

                e = j;

            }
            if ((s >= 0) && (e >= 0))
            {

                break;

            }

        }
        if ((s == -1) && (e == -1))
        {

            return (new int [] {-1});

        }
        max_intr = min_intr = A[s];
        for (i = s; i <= e; i += 1)
        {

            min_intr = Math.min(min_intr, A[i]);
            max_intr = Math.max(max_intr, A[i]);

        }
        for (i = 0; i < s; i += 1)
        {

            if (A[i] > min_intr)
            {

                s = i;
                break;

            }

        }
        for (j = (A.length - 1); j >= (e + 1); j -= 1)
        {

            if (A[j] < max_intr)
            {

                e = j;
                break;

            }

        }
        return (new int [] {s, e});

    }

}
