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
        int row = 1, col = 0, i = 0, j = 0, dir = 0, count = 0;
        int res_arr [] = new int [(matrix.length * matrix[0].length)];
        for (col = 0; col < matrix[0].length; col += 1)
        {

            i = col;
            j = 0;
            count = inner_while(i, j, dir, count, matrix, res_arr);
            dir = (dir == 0 ? 1 : 0);

        }
        for (row = 1; row < matrix.length; row += 1)
        {

            i = matrix[0].length - 1;
            j = row;
            count = inner_while(i, j, dir, count, matrix, res_arr);
            dir = (dir == 0 ? 1 : 0);

        }
        return (res_arr);

    }

    private int inner_while(int i, int j, int dir, int count, int [][] matrix, int [] res_arr)
    {

        Stack <Integer> stk = new Stack <Integer> ();
        while ((i >= 0) && (j < matrix.length))
        {

            stk.push(matrix[j][i]);
            i -= 1;
            j += 1;

        }
        if (dir == 1)
        {

            Collections.reverse(stk);

        }
        while (!(stk.empty()))
        {

            res_arr[count] = stk.pop();
            count += 1;

        }
        return (count);

    }

}
