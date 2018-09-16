/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 14 Sep, 2018, 9:49 PM,
        @File-Name : NobleInteger.java

 */

package com.ib.programming.arrays;

import java.util.Arrays;

public class NobleInteger
{

    public int solve(final int A [])
    {

        if ((A == null) || (A.length == 0))
        {

            return (-1);

        }
        int i = 0;
        Arrays.sort(A);
        for (i = 0; i < A.length; i += 1)
        {

            if ((A.length - (i + 1)) == A[i])
            {

                if (((i + 1) != A.length) && (A[i] == A[i + 1]))
                {

                    continue;

                }
                return (1);

            }

        }
        return (-1);

    }

}
