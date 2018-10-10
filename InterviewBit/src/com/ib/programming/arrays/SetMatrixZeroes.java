/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 10 Oct, 2018, 2:14 PM,
        @File-Name : SetMatrixZeroes.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class SetMatrixZeroes
{

    public void setZeroes(final ArrayList <ArrayList <Integer>> a)
    {

        boolean col_to_set = false;
        int i = 0, j = 0;
        for (i = 0; i < a.size(); i += 1)
        {

            if ((a.get(i)).get(0) == 0)
            {

                col_to_set = true;

            }
            for (j = 1; j < (a.get(0)).size(); j += 1)
            {

                if ((a.get(i)).get(j) == 0)
                {

                    (a.get(i)).set(0, 0);
                    (a.get(0)).set(j, 0);

                }

            }

        }
        for (i = 1; i < a.size(); i += 1)
        {

            for (j = 1; j < (a.get(0)).size(); j += 1)
            {

                if (((a.get(i)).get(0) == 0) || ((a.get(0)).get(j) == 0))
                {

                    (a.get(i)).set(j, 0);

                }

            }

        }
        if ((a.get(0)).get(0) == 0)
        {

            for (j = 1; j < (a.get(0)).size(); j += 1)
            {

                (a.get(0)).set(j, 0);

            }

        }
        if (col_to_set)
        {

            for (i = 0; i < a.size(); i += 1)
            {

                (a.get(i)).set(0, 0);

            }

        }

    }

}
