/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Oct, 2018, 6:33 AM,
        @File-Name : Sieve.java

 */

package com.ib.programming.math;

import java.util.ArrayList;

public class Sieve
{

    public ArrayList <Integer> sieve(final int n)
    {

        boolean [] temp =  new boolean [n + 1];
        ArrayList <Integer> lst = new ArrayList <Integer> ();
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
        for (i = 0; i <= n; i += 1)
        {

            if (temp[i])
            {

                lst.add(i);

            }

        }
        return (lst);

    }

}
