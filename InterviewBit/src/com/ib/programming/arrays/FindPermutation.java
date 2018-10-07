/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 07 Oct, 2018, 10:29 PM,
        @File-Name : FindPermutation.java

 */

package com.ib.programming.arrays;

import java.util.Stack;
import java.util.ArrayList;

public class FindPermutation
{

    public ArrayList <Integer> findPerm(final String key, final int n)
    {

        if ((key == null) || (key.length() == 0))
        {

            return (new ArrayList <Integer> ());

        }
        ArrayList <Integer> per = new ArrayList <Integer> (n);
        Stack <Integer> stk =  new Stack <Integer> ();
        for (int i = 1; i <= n; i += 1)
        {

            stk.push(i);
            if ((i == n) || (key.charAt(i - 1) == 'I'))
            {


                while (!(stk.empty()))
                {

                    per.add(stk.pop());

                }

            }

        }
        return (per);

    }

}
