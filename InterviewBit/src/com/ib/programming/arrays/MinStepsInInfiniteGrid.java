/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 08 Sep, 2018, 1:38 PM,
        @File-Name : MinStepsInInfiniteGrid.java

 */

package com.ib.programming.arrays;

import java.lang.Math;

public class MinStepsInInfiniteGrid
{

    public int coverPoints(final int [] X, final int [] Y)
    {
        if ((X.length == 0) || (Y.length == 0) || (X == null) || (Y == null))
        {

            return (0);

        }
        int min_steps = 0, i = 0;
        for(i = 0; i < (X.length - 1); i += 1)
        {

            min_steps += Math.max(Math.abs((X[i + 1] - X[i])), Math.abs((Y[i + 1] - Y[i])));

        }
        return (min_steps);

    }

}
