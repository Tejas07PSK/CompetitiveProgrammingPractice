/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Oct, 2018, 11:07 PM,
        @File-Name : PascalsTriangle.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class PascalsTriangle
{

    public ArrayList <ArrayList <Integer>> solve(final int A)
    {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = null;
        int c = 0;
        for (int i = 1; i <= A; i += 1)
        {

            temp = new ArrayList<Integer>();
            c = 1;
            temp.add(c);
            for (int j = 1; j < i; j += 1)
            {

                c *= (i - j);
                c /= j;
                temp.add(c);

            }
            res.add(temp);

        }
        return (res);

    }

}
