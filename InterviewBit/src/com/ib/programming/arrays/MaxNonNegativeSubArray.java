/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 13 Sep, 2018, 6:37 PM,
        @File-Name : MaxNonNegativeSubArray.java

 */

package com.ib.programming.arrays;

public class MaxNonNegativeSubArray
{

    public int [] maxSet(final int A [])
    {

        if ((A == null) || (A.length == 0))
        {

            return (new int [0]);

        }
        int i = 0, c_neg = 0, c = 0, g_sub [] = {0, 0}, c_sub [] = {0, 0};
        long c_sum = 0, g_sum = 0;
        for (i = 0; i < A.length; i += 1)
        {

            c_neg += (A[i] < 0) ? 1 : 0;
            c_sum += (A[i] < 0) ? 0 : A[i];
            c_sub[1] = (A[i] < 0) ? c_sub[1] : i;
            if ((A[i] < 0) || (i == (A.length - 1)))
            {

                if (c_sum > g_sum)
                {

                    g_sum = c_sum;
                    g_sub[0] = c_sub[0];
                    g_sub[1] = c_sub[1];

                }
                else if (c_sum == g_sum)
                {

                    if ((c_sub[1] - c_sub[0] + 1) > (g_sub[1] - g_sub[0] + 1))
                    {

                        g_sub[0] = c_sub[0];
                        g_sub[1] = c_sub[1];

                    }
                    else if ((c_sub[1] - c_sub[0] + 1) == (g_sub[1] - g_sub[0] + 1))
                    {

                        if (c_sub[0] < g_sub[0])
                        {

                            g_sub[0] = c_sub[0];
                            g_sub[1] = c_sub[1];

                        }

                    }

                }
                c_sub[0] = (i + 1);
                c_sum = 0;

            }

        }
        if (c_neg == A.length)
        {

            return (new int [0]);

        }
        int res_arr [] = new int [(g_sub[1] - g_sub[0] + 1)];
        for (i = g_sub[0]; i <= g_sub[1]; i += 1)
        {

            res_arr[c] = A[i];
            c += 1;

        }
        return (res_arr);

    }

}
