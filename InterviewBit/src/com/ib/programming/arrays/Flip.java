/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 13 Sep, 2018, 11:25 AM,
        @File-Name : Flip.java

 */

package com.ib.programming.arrays;

public class Flip
{

    public int [] flip(String A)
    {

        if ((A == null) || (A.length() == 0))
        {

            return (new int [0]);

        }
        int c_subarr [] = {1, 1}, g_subarr [] = {1, 1};
        int c_max = 0, g_max = 0, i = 0, val = 0;

        //Modified Kadane's Algorithm..........
        for (i = 0; i < A.length(); i += 1)
        {

            val = (A.charAt(i) == '0') ? 1 : -1;
            if (val > (c_max + val))
            {

                c_max = val;
                c_subarr[0] = (i + 1);
                c_subarr[1] = (i + 1);

            }
            else
            {

                c_max = (c_max + val);
                c_subarr[1] = (i + 1);

            }
            if (c_max > g_max)
            {

                g_max = c_max;
                g_subarr[0] = c_subarr[0];
                g_subarr[1] = c_subarr[1];

            }

        }
        return ((g_max > 0) ? g_subarr : new int [0]);

    }

}
