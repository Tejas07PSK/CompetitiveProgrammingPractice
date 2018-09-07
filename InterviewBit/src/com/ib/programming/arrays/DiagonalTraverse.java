/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 07 Sep, 2018, 2:04 PM,
        @File-Name : DiagonalTraverse.java

 */

package com.ib.programming.arrays;

import java.util.Collections;
import java.util.Stack;

public class DiagonalTraverse
{

    public int[] findDiagonalOrder(int[][] matrix)
    {

        if ((matrix.length == 0) || ((matrix.length == 1) && (matrix[0].length == 0)))
        {

            return (new int [0]);

        }
        else if (matrix.length == 1)
        {

            return (matrix[0]);

        }
        else if (matrix[0].length == 1)
        {

            int[] res_arr = new int[matrix.length];
            for (int i = 0; i < matrix.length; i += 1)
            {

                res_arr[i] = matrix[i][0];

            }
            return (res_arr);

        }
        int i = 0, j = 0, dir = 1, count = 0;
        int res_arr [] = new int [(matrix.length * matrix[0].length)];
        while ((i < matrix.length) && (j < matrix[0].length))
        {

            res_arr[count] = matrix[i][j];
            count += 1;
            if (dir == 1)
            {

                j += 1;
                if (i == 0)
                {

                    dir = 2;

                }
                else
                {

                    dir = 4;
                }

            }
            else if (dir == 2)
            {

                j -= 1;
                i += 1;
                if (j == 0)
                {

                    dir = 3;

                }
                if (i == (matrix.length - 1))
                {

                    dir = 1;

                }

            }
            else if (dir == 3)
            {

                i += 1;
                if (j == 0)
                {

                    dir = 4;

                }
                else
                {

                    dir = 2;

                }

            }
            else // dir = 4
            {

                i -= 1;
                j += 1;
                if (i == 0)
                {

                    dir = 1;

                }
                if (j == (matrix[0].length - 1))
                {

                    dir = 3;

                }

            }

        }
        return (res_arr);

    }

}
