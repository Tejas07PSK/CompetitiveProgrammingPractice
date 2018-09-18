/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 18 Sep, 2018, 11:17 PM,
        @File-Name : WaveArray.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class WaveArray
{

    public ArrayList<Integer> wave(ArrayList<Integer> A)
    {

        for (int i = 0; i < A.size(); i += 2)
        {

            if ((i > 0) && (A.get(i - 1) > A.get(i)))
            {

                A.set(i, (A.get(i) ^ A.get(i - 1)));
                A.set((i - 1), (A.get(i) ^ A.get(i - 1)));
                A.set(i, (A.get(i) ^ A.get(i - 1)));

            }
            if ((i < (A.size() - 1)) && (A.get(i + 1) > A.get(i)))
            {

                A.set(i, (A.get(i) ^ A.get(i + 1)));
                A.set((i + 1), (A.get(i) ^ A.get(i + 1)));
                A.set(i, (A.get(i) ^ A.get(i + 1)));

            }

        }
        return (A);

    }

}

