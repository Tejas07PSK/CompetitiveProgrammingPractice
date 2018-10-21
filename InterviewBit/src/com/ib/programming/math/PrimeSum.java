/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Oct, 2018, 6:10 AM,
        @File-Name : PrimeSum.java

 */

package com.ib.programming.math;

import java.util.ArrayList;

public class PrimeSum
{

    public ArrayList <Integer> primesum(final int n)
    {

        if (n <= 2)
        {

            return (new ArrayList <Integer> ());

        }
        ArrayList <Integer> res = new ArrayList <Integer> ();
        boolean [] areNosPrime = sieve(n);
        for (int i = 0; i < n; i += 1)
        {

            if (areNosPrime[i] && areNosPrime[n - i])
            {

                res.add(i);
                res.add(n - i);
                return (res);

            }

        }
        return (res);

    }

    private boolean [] sieve(final int n)
    {

        boolean [] temp =  new boolean [n + 1];
        int i = 0, limit = (int)Math.sqrt(n);
        for (; i <= n; i += 1)
        {

            temp[i] = !(i < 2);

        }
        for (i = 2; i <= limit; i += 1)
        {

            if (temp[i])
            {

                for (int j = 2; (j * i) <= n; j += 1)
                {

                    temp[i * j] = false;

                }

            }

        }
        return (temp);

    }

}
