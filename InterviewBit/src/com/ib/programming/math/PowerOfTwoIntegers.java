/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 21 Oct, 2018, 9:52 AM,
        @File-Name : PowerOfTwoIntegers.java

 */

package com.ib.programming.math;

import java.lang.Math;

public class PowerOfTwoIntegers
{

    private static final double factor = 1e-8;
    public boolean isPower(final int A)
    {

        if (A == 1)
        {

            return (true);

        }
        double exp = 0.0;
        for (int i = 2; (i * i) <= A; i += 1)
        {

            exp = (Math.log(A) / Math.log(i));
            if ((exp - (int)exp) < factor)
            {

                return (true);

            }

        }
        return (false);

    }

}
