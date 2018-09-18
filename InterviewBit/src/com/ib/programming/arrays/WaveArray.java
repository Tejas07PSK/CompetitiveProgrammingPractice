/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 18 Sep, 2018, 11:17 PM,
        @File-Name : WaveArray.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray
{

    public ArrayList<Integer> wave(final ArrayList<Integer> A)
    {

        for (int i = 0; i < (A.size() - 1); i += 2)
        {

            Collections.swap(A, i, (i + 1));

        }
        return (A);

    }

}

