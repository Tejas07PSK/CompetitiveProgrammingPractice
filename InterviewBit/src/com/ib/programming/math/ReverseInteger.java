/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 23 Oct, 2018, 4:08 AM,
        @File-Name : ReverseInteger.java

 */

package com.ib.programming.math;

public class ReverseInteger
{

    public int reverse(int A)
    {

        int res = 0, append = 0;
        while (A != 0)
        {

            append = A % 10;
            A /= 10;
            if ((res > (Integer.MAX_VALUE / 10)) || ((res == Integer.MAX_VALUE / 10) && (append > 7)) || (res < (Integer.MIN_VALUE / 10)) || ((res == Integer.MIN_VALUE / 10) && (append < -8)))
            {

                return (0);

            }
            res = res * 10 + append;

        }
        return (res);

    }

}
