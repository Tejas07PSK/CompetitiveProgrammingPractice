/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Oct, 2018, 7:59 AM,
        @File-Name : AllFactors.java

 */

package com.ib.programming.math;

import java.util.ArrayList;
import java.lang.Math;

public class AllFactors
{

    public ArrayList <Integer> allFactors(final int A)
    {

        ArrayList <Integer> lst = new ArrayList <Integer> ();
        int limit = (int)Math.sqrt(A);
        int i = 0, factor = 0;
        for (i = 1; i <= limit; i += 1)
        {

            if ((A % i) == 0)
            {

                lst.add(i);

            }

        }
        for (i = (lst.size() - 1); i >= 0; i -= 1)
        {

            factor = lst.get(i);
            if (factor != (A / factor))
            {

                lst.add((A / factor));

            }

        }
        return (lst);

    }

}
