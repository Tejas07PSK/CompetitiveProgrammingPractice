/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 09 Sep, 2018, 3:12 PM,
        @File-Name : MaximumAbsoluteDifference.java

 */

package com.ib.programming.arrays;

public class MaximumAbsoluteDifference
{

    public int maxArr(final int A [])
    {

        if ((A == null) || (A.length == 0))
        {

            return (0);

        }
        int max_min [][] = {{A[0], A[0]}, {A[0], A[0]}};
        for (int i = 1; i < A.length; i += 1)
        {

            max_min[0][0] = Math.max((A[i] + i), max_min[0][0]);
            max_min[0][1] = Math.min((A[i] + i), max_min[0][1]);
            max_min[1][0] = Math.max((A[i] - i), max_min[1][0]);
            max_min[1][1] = Math.min((A[i] - i), max_min[1][1]);

        }
        return (Math.max(Math.abs(max_min[0][0] - max_min[0][1]), Math.abs(max_min[1][0] - max_min[1][1])));

    }

}
