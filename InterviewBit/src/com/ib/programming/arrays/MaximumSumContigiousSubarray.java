/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 09 Sep, 2018, 12:34 AM,
        @File-Name : MaximumSumContigiousSubarray.java

 */

package com.ib.programming.arrays;

public class MaximumSumContigiousSubarray
{

    public int maxSubArray(final int A [])
    {

        if (A == null || A.length == 0)
        {

            return (0);

        }
        int ovr_max = 0, loc_max = 0, i = 0;
        ovr_max = loc_max = A[0];
        for (i = 1; i < A.length; i += 1)
        {

            loc_max = Math.max(loc_max + A[i], A[i]);
            ovr_max = Math.max(loc_max, ovr_max);

        }
        return (ovr_max);

    }

}
