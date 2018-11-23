/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 23 Nov, 2018, 11:48 PM,
        @File-Name : RearrangeArray.java

 */

package com.ib.programming.math;

import java.util.ArrayList;

public class RearrangeArray
{

    private void encode(final ArrayList <Integer> arr, final int len)
    {

        for (int i = 0; i < len; i += 1)
        {

            arr.set(i, (arr.get(i) + ((arr.get(arr.get(i)) % len) * len)));

        }

    }

    private void new_vals(final ArrayList <Integer> arr, final int len)
    {

        for (int i = 0; i < len; i += 1)
        {

            arr.set(i, (arr.get(i) / len));

        }

    }

    private void old_vals(final ArrayList <Integer> arr, final int len)
    {

        for (int i = 0; i < len; i += 1)
        {

            arr.set(i, (arr.get(i) % len));

        }

    }

    public void arrange(final ArrayList <Integer> A)
    {

        if (A == null)
        {

            return;

        }
        int len = A.size();
        if ((len == 0) || (len == 1))
        {

            return;

        }
        encode(A, len);
        new_vals(A, len);

    }

}
