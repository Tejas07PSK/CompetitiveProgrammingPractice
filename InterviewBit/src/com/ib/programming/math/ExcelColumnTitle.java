/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 22 Oct, 2018, 1:57 AM,
        @File-Name : ExcelColumnTitle.java

 */

package com.ib.programming.math;

public class ExcelColumnTitle
{

    private static final int base = 26;
    public String convertToTitle(final int A)
    {

        int n = A;
        StringBuilder sb = new StringBuilder ();
        while (n > 0)
        {

            n -= 1;
            sb.append((char)((n % base) + 65));
            n /= base;

        }
        sb.reverse();
        return (sb.toString());

    }

}
