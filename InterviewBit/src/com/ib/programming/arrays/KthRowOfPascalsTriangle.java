/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Oct, 2018, 11:39 PM,
        @File-Name : KthRowOfPascalsTriangle.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class KthRowOfPascalsTriangle
{

    public ArrayList <Integer> solve(final int A)
    {

        ArrayList <Integer> res = new ArrayList <Integer> ();
        int c = 1;
        res.add(c);
        for (int i = 1; i < A; i += 1)
        {

            c *= (A - i);
            c /= i;
            res.add(c);

        }
        return (res);

    }

}
