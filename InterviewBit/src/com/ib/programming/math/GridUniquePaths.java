/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 24 Nov, 2018, 9:00 PM,
        @File-Name : GridUniquePaths.java

 */

package com.ib.programming.math;

public class GridUniquePaths
{

    public int uniquePaths(final int A, final int B)
    {

        int N = A + B - 2, K = B - 1;
        long paths = 1;
        for (int i = 1; i <= K; i += 1)
        {

           paths = paths * (N - K + i) / i;

        }
        return ((int)paths);

    }

}
