/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 25 Oct, 2018, 11:11 PM,
        @File-Name : TrailingZerosFactorial.java

 */

package com.ib.programming.math;

public class TrailingZerosFactorial
{

    public int trailingZeroes(final int A)
    {

        int div = 5, count = 0;
        while (div <= A)
        {

           count +=  Math.floor((A / div));
           div *= 5;

        }
        return (count);

    }

}
