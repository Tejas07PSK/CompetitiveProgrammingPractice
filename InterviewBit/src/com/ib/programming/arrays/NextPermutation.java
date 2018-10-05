/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 05 Oct, 2018, 1:43 PM,
        @File-Name : NextPermutation.java

 */

package com.ib.programming.arrays;

import java.util.Collections;
import java.util.List;

public class NextPermutation
{

    public void nextPermutation(final List <Integer> lst)
    {

        if ((lst == null) || (lst.size() == 1))
        {

            return;

        }
        int i = (lst.size() - 2), j = (lst.size() - 1);
        while ((i >= 0) && (lst.get(i) >= lst.get(i + 1)))
        {

            i -= 1;

        }
        if (i >= 0)
        {

            for (; j >= i; j -= 1)
            {

                if (lst.get(j) > lst.get(i))
                {

                    break;

                }

            }
            Collections.swap(lst, i, j);

        }
        reverse(lst, (i + 1));

    }

    private void reverse(final List <Integer> lst, int idx)
    {

        int k = lst.size() - 1;
        while (idx < k)
        {

            Collections.swap(lst, idx, k);
            idx += 1;
            k -= 1;

        }

    }

}
