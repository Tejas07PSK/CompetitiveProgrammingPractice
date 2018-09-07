/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 07 Sep, 2018, 9:48 PM,
        @File-Name : SpiralMatrix.java

 */

package com.leetcode.problems.arrays;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix
{

    public List<Integer> spiralOrder(int[][] A)
    {

        if ((A == null) || (A.length == 0) || (A[0].length == 0))
        {

            return (new ArrayList <Integer> ());

        }
        List <Integer> arr = new ArrayList <Integer> ();
        int temp [][] = new int [A.length][A[0].length];
        int count = 1, t = 0, x = 0, y = 0;
        int offset [] = {0, 1};
        while (count <= (A.length * A[0].length))
        {

            arr.add(A[x][y]);
            temp[x][y] = count;
            if (((y + offset[1]) == A[0].length) || ((x + offset[0]) == A.length) || ((y + offset[1]) < 0) || ((x + offset[0]) < 0) || (temp[x + offset[0]][y + offset[1]] > 0))
            {

                t = offset[0];
                offset[0] = offset[1];
                offset[1] = -t;

            }
            x += offset[0];
            y += offset[1];
            count += 1;

        }
        return (arr);

    }

}
