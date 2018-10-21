/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 22 Oct, 2018, 3:48 AM,
        @File-Name : BinaryRepresentation.java

 */

package com.ib.programming.math;

public class BinaryRepresentation
{

    private static final int base = 2;
    public String findDigitsInBinary(final int A)
    {

        if (A == 0)
        {

            return ("0");

        }
        int n = A;
        StringBuilder sb = new StringBuilder ();
        while (n > 0)
        {

            sb.append(n % base);
            n /= base;

        }
        sb.reverse();
        return (sb.toString());

    }

}
