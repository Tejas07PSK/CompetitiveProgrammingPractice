/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 02 Oct, 2018, 5:35 PM,
        @File-Name : RotateMatrix.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class RotateMatrix
{

    public void rotate(final ArrayList <ArrayList <Integer>> A)
    {

        if ((A == null) || (A.size() == 0) || ((A.size() == 1) && ((A.get(0)).size() == 1)) || (A.size() != (A.get(0)).size()))
        {

            return;

        }
        int rings = (A.size() / 2), temp = 0;
        for (int i = 0; i < rings; i += 1)
        {

            for (int j = i; j < (A.size() - i - 1); j += 1)
            {

                temp = (A.get(A.size() - j - 1)).get(i);

                // bottom right to bottom left
                (A.get(A.size() - j - 1)).set(i, (A.get(A.size() - i - 1)).get(A.size() - j - 1));

                // top right to bottom right
                (A.get(A.size() - i - 1)).set((A.size() - j - 1), (A.get(j)).get(A.size() - i - 1));

                // top left to top right
                (A.get(j)).set((A.size() - i - 1), (A.get(i)).get(j));

                // bottom left to top left
                (A.get(i)).set(j, temp);

            }

        }

    }

    public void rotate2(final ArrayList <ArrayList <Integer>> A)
    {

        if ((A == null) || (A.size() == 0) || ((A.size() == 1) && ((A.get(0)).size() == 1)) || (A.size() != (A.get(0)).size()))
        {

            return;

        }
        int i = 0, j = 0, k = 0;

        // transpose of input_matrix
        for (i = 0; i < A.size(); i += 1)
        {

            for (j = i; j < A.size(); j += 1)
            {

                if (!(((A.get(i)).get(j)).equals((A.get(j)).get(i))))
                {

                    (A.get(i)).set(j, ((A.get(i)).get(j) ^ (A.get(j)).get(i)));
                    (A.get(j)).set(i, ((A.get(i)).get(j) ^ (A.get(j)).get(i)));
                    (A.get(i)).set(j, ((A.get(i)).get(j) ^ (A.get(j)).get(i)));

                }

            }

        }

        // now reverse rows, because we are rotating the array 90deg in clockwise direction
        for (i = 0; i < A.size(); i += 1)
        {

            j = 0; k = (A.size() - 1);
            while (j < k)
            {

                Collections.swap(A.get(i), j, k);
                j += 1;
                k -= 1;

            }

        }

    }

}
