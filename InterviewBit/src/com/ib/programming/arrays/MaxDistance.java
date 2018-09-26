/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Sep, 2018, 1:27 PM,
        @File-Name : MaxDistance.java

 */

package com.ib.programming.arrays;

import java.util.List;
import java.lang.Math;

public class MaxDistance
{

    public int maximumGap(final List <Integer> A)
    {

        if (A == null)
        {

            return (-1);

        }
        int max_right [] = new int [A.size()];
        int i = 0, j = 0, max_diff = 0;
        max_right[A.size() - 1] = A.get(A.size() - 1);
        for (i = (A.size() - 2); i >= 0; i -= 1)
        {

            if (A.get(i) > max_right[i + 1])
            {

                max_right[i] = A.get(i);

            }
            else
            {

                max_right[i] = max_right[i + 1];

            }

        }
        i = 0;
        while ((i < A.size()) && (j < A.size()))
        {

            if (A.get(i) <= max_right[j])
            {

                max_diff = Math.max(max_diff, (j - i));
                j += 1;

            }
            else
            {

                i += 1;

            }

        }
        //System.out.println(Arrays.toString(max_right));
        return (max_diff);

    }

}
