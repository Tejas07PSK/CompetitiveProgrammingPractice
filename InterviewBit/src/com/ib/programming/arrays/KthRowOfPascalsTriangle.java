/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Oct, 2018, 11:39 PM,
        @File-Name : KthRowOfPascalsTriangle.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class KthRowOfPascalsTriangle
{

    // k is 0 based. k = 0, corresponds to the row [1]. 
    public ArrayList <Integer> getRow(final int k)
    {

        ArrayList <Integer> res = new ArrayList <Integer> ();
        int c = 1;
        res.add(c);
        for (int i = 1; i < (k + 1); i += 1)
        {

            c *= ((k + 1) - i);
            c /= i;
            res.add(c);

        }
        return (res);

    }

}
