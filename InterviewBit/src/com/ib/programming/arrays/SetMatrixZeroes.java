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
        int r = 0, c = 0;
        for (r = 0; r < a.size(); r += 1)
        {

            // Since first cell for both first row and first column is the same i.e., matrix[0][0].
            // We can use a extra variable for either the first row or first column.
            // In this case we will use an additional variable for the first column i.e., col_to_set.
            // and using matrix[0][0] for the first row.
            if ((a.get(r)).get(0) == 0)
            {

                col_to_set = true;

            }
            for (c = 1; c < (a.get(0)).size(); c += 1)
            {

                // If any element is 0, we set the first elements of it's corresponding row and column to 0.
                if ((a.get(r)).get(c) == 0)
                {

                    (a.get(r)).set(0, 0);
                    (a.get(0)).set(c, 0);

                }

            }

        }
        // Iterate over the array once again and using the first row and first column, update the elements.
        for (r = 1; r < a.size(); r += 1)
        {

            for (c = 1; c < (a.get(0)).size(); c += 1)
            {

                if (((a.get(r)).get(0) == 0) || ((a.get(0)).get(c) == 0))
                {

                    (a.get(r)).set(c, 0);

                }

            }

        }
        // Check if all elements in the first row needs to be set to zero.
        if ((a.get(0)).get(0) == 0)
        {

            for (c = 1; c < (a.get(0)).size(); c += 1)
            {

                (a.get(0)).set(c, 0);

            }

        }
        // Check if all elements in the first column needs to be set to zero.
        if (col_to_set)
        {

            for (r = 0; r < a.size(); r += 1)
            {

                (a.get(r)).set(0, 0);

            }

        }

    }

}
