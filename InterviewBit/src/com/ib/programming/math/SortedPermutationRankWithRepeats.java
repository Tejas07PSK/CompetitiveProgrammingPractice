/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 23 Nov, 2018, 7:32 PM,
        @File-Name : SortedPermutationRankWithRepeats.java

 */

package com.ib.programming.math;

public class SortedPermutationRankWithRepeats
{

    private static final int mod = 1000003;

    private static int fact(int n)
    {

        if ((n == 0) || (n == 1))
        {

            return (1);

        }
        if (n < 0)
        {

            n = -n;

        }
        int f = 1;
        while (n > 0)
        {

            f = (f * n) % mod;
            n -= 1;

        }
        return (f % mod);

    }

    private static int countSmallerCharsOnRt(final String A, final int end, final int start)
    {

        int i = start + 1, count = 0;
        while (i <= end)
        {

            if ((int)A.charAt(i) < (int)A.charAt(start))
            {

                count += 1;

            }
            i += 1;

        }
        return (count);

    }

    private static int prodOfFactOfRepChars(final String A, final int end, int start)
    {

        int [] chars = new int [52]; int prod = 1;
        while (start <= end)
        {

            if (((int)(A.charAt(start)) >= (int)'A') && ((int)(A.charAt(start)) <= (int)'Z'))
            {

                chars[(int)A.charAt(start) - (int)'A'] += 1;

            }
            else
            {

                chars[(int)A.charAt(start) - (int)'a' + 26] += 1;

            }
            start += 1;

        }
        for (int i : chars)
        {

            prod = (prod * fact(i)) % mod;

        }
        return ((int)(Math.pow(prod, (mod - 2)) % mod));

    }

    public int findRank(final String A)
    {

        int len = A.length(), rank = 1;
        if ((len == 0) || (len == 1))
        {

            return (1);

        }
        for (int i = 0; i < len; i += 1)
        {

            rank += ((countSmallerCharsOnRt(A, (len - 1), i) * fact(len - i - 1)) / prodOfFactOfRepChars(A, (len - 1), i)) % mod;
            rank %= mod;

        }
        return (rank);

    }

}
