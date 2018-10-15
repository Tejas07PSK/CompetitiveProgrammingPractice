/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 15 Oct, 2018, 10:05 PM,
        @File-Name : FirstMissingInteger.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FirstMissingInteger
{

    public int firstMissingPositive2(final List <Integer> inp)
    {

        int length = inp.size(), i = 0;
        while (i < length)
        {

            if ((inp.get(i) == (i + 1)) || (inp.get(i) <= 0) || (inp.get(i) > length))
            {

                i += 1;

            }
            else if (!((inp.get(inp.get(i) - 1)).equals(inp.get(i))))
            {

                Collections.swap(inp, i, (inp.get(i) - 1));

            }
            else
            {

                i += 1;

            }

        }
        i = 0;
        while ((i < length) && (inp.get(i) == (i + 1)))
        {

            i += 1;

        }
        return (i + 1);

    }

    public int firstMissingPositive(final List <Integer> inp)
    {

        int len = inp.size();
        int offset = partition(inp, len);
        int j = 0;
        List <Integer> n_inp = new ArrayList <Integer> ();
        for (int i = offset; i < inp.size(); i += 1)
        {

            n_inp.add(inp.get(i));
            j += 1;

        }
        return (findIt(n_inp, j));

    }

    private int partition(final List <Integer> inp, final int len)
    {

        int j = 0;
        for (int i = 0; i < len; i += 1)
        {

            if (inp.get(i) <= 0)
            {

                Collections.swap(inp, i, j);
                j += 1;

            }

        }
        return (j);

    }

    private int findIt(final List <Integer> n_inp, final int len)
    {

        int i = 0;
        for (i = 0; i < len; i += 1)
        {

            if (((Math.abs(n_inp.get(i)) - 1) < n_inp.size()) && (n_inp.get(Math.abs(n_inp.get(i)) - 1) > 0))
            {

                n_inp.set((Math.abs(n_inp.get(i)) - 1), -(n_inp.get(Math.abs(n_inp.get(i)) - 1)));

            }

        }
        for (i = 0; i < len; i += 1)
        {

            if (n_inp.get(i) > 0)
            {

                return (i + 1);

            }

        }
        return (len + 1);

    }

}
