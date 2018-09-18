/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Sep, 2018, 8:05 PM,
        @File-Name : HotelBookingPossible.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingPossible
{

    public boolean hotel(final ArrayList <Integer> A, final ArrayList <Integer> D, final int K)
    {

        Collections.sort(A);
        Collections.sort(D);
        int guests = 0, i = 0, j = 0;
        while ((i < A.size()) && (j < D.size()) && (guests <= K))
        {

            if (A.get(i) < D.get(j))
            {

                guests += 1;
                i += 1;

            }
            else
            {

                guests -= 1;
                j += 1;

            }

        }
        return (guests <= K);

    }

}
