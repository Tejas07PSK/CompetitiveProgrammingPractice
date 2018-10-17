/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 18 Oct, 2018, 2:49 AM,
        @File-Name : AntiDiagonals.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;

public class AntiDiagonals
{

    public ArrayList <ArrayList <Integer>> diagonal(ArrayList <ArrayList <Integer>> arr)
    {

        int n = arr.size();
        ArrayList <ArrayList <Integer>> res = new ArrayList <ArrayList <Integer>> ();
        if(n == 0)
        {

            return (res);

        }
        for (int i = 0; i <= (2 * (n - 1)); i++)
        {

            ArrayList <Integer> temp = new ArrayList <Integer> ();
            for (int j = 0; j <= i; j++)
            {

                int dif = (i - j);
                if((j >= n) || (dif >= n))
                {

                    continue;

                }
                temp.add(arr.get(j).get(dif));

            }
            res.add(temp);

        }
        return (res);

    }

}
